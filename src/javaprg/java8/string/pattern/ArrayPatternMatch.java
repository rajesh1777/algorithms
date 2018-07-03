package javaprg.java8.string.pattern;

import java.util.Arrays;


public class ArrayPatternMatch
{
    
    public static void main(String[] args)
    {
        String[] booking = {"1A", "2A", "3A"};
        booked(booking);
    }

    private static void booked(String[] booking)
    {
       BookingStatus bookingStatus = new ArrayPatternMatch.BookingStatus();
       for (String string : booking)
       {
           bookingStatus.book(string);
       }
       int counter = 0;
       for(int i=0; i<3 ; i++) {
           boolean[] first = bookingStatus.getRange(i, Range.FIRST);
           System.out.println("First ------------------------");
           print(first);
           
           boolean[] second = bookingStatus.getRange(i, Range.SECOND);
           System.out.println("Second ----------------------");
           print(second);
           boolean[] third = bookingStatus.getRange(i, Range.THIRD);
           System.out.println("Third -------------------------");
           print(third);
           
           if(isAvail(first,3)) ++counter;
           if(isAvail(second,3)) ++counter;
           if(isAvail(third,3)) ++counter;
       }
       System.out.println("Total : "+ counter);
    }  
    
    private static void print(boolean[] first) {
        for (boolean b : first)
        {
            System.out.println("value " +b);
        }
    }
    
    private static boolean isAvail(boolean[] values, int cons) {
       if(values.length == cons) {
           return isEqauls(values, new boolean[]{false,false,false});
       } 
       else {
           int start = 0 ;
           while(start < (values.length - cons) ) {
              boolean[] temp = Arrays.copyOfRange(values, start, (start+cons)); 
              if (isEqauls(temp, new boolean[]{false,false,false})) {
                  return true;
              } 
              start ++;
           }
       }
       return false;
    }
    
    private static boolean isEqauls(boolean[] a, boolean[] b) {
        return Arrays.equals(a, b);
    }
    
    
    
    enum Range{
        FIRST(0,2),
        SECOND(3,6),
        THIRD(7,9);
        private int start;
        public int getStart()
        {
            return start;
        }
        public int getEnd()
        {
            return end;
        }
        private int end;
        Range(int i, int end){
            this.start =i;
            this.end = end;
        }
    }
    static class BookingStatus {
        boolean[][] bookingStatus ;
        public BookingStatus(){
            bookingStatus = new boolean[3][10];            
        }
        
        public boolean book(String seatNum) {
            boolean isBooked = false;
            char rowChar = seatNum.charAt(0);
            char column = seatNum.charAt(1);
            if(!bookingStatus[getRowIndex(rowChar)][getColIndex(column)]) {
                isBooked = true;
                bookingStatus[getRowIndex(rowChar)][getColIndex(column)] = isBooked;
            }
            return isBooked;
        }
        
        private int getColIndex(char c) {
            char a = 'A';
            return (int)c%a;
        }
        
        private int getRowIndex(char c) {
            char a = '1';
            return (int)c%a;
        }
        
        public boolean[] getRange(int row, Range range) {
            return Arrays.copyOfRange(bookingStatus[row], range.getStart(), (range.getEnd()+1));            
        }
    }
}
