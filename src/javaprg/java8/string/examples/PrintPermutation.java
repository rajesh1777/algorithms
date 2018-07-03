package javaprg.java8.string.examples;

import java.io.InputStreamReader;

public class PrintPermutation
{
    public static void main(String[] args )
    {
        printPermutation(0,"XyYzZ");
    }

    private static void printPermutation(int i, String string)
    {
        if(i >= string.length()) {
            return ;
        }
        char[] charArr = string.toCharArray();
        
        //swapPrint(charArr, 0, 1);
        //swapPrint(charArr, 1, 2);
        //swapPrint(charArr, 2, 3);
        InputStreamReader reader = new InputStreamReader(System.in);
        giveshot(0, charArr);
        
        printPermutation((i+1), new String(charArr));
    }
    
   private static void giveshot(int i, char[] charArr) {
       if(i >= (charArr.length-1)) {
           return ;
       }
       swapPrint(charArr, i, i+1);
       giveshot((i+1), charArr);
   }
    
    private static void swapPrint(char[] charArr, int i, int j) {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp; 
        
        System.out.println(new String(charArr));
    }
    
    
}
