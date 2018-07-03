package javaprg.java8.string.examples;

public class ExactShuffle
{
    public static void main(String[] args)
    {
        String first = "abcd";
        String second = "efx";
        String shuffle = "aefbcdd";
        
        System.out.println(findIfExactShuffle(shuffle,first,second));        
    }

    private static boolean findIfExactShuffle(String shuffle, String first, String second)
    {
        int i=0 ;
        int j=0 ;
        int indexF = -1;
        int indexS = -1;
        while(j<second.length()) {
            char charSecond = second.charAt(j);
            int tindexS = shuffle.indexOf(charSecond);
            if( (tindexS == -1)  ||  (tindexS < indexS)) {
                return false;
            } else { 
                indexS = tindexS;
                j++;                
            }   
        }
        
        while(i<first.length()) {
                char charfirst = first.charAt(i);
            int tindexF = shuffle.indexOf(charfirst);
            if( (tindexF == -1)  ||  (tindexF < indexF)) {
                return false;
            } else { 
                indexF = tindexF;
                i++;                
            }  
        }
        return true;
    }
}
