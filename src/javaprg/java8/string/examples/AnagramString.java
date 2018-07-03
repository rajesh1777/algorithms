package javaprg.java8.string.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;


public class AnagramString
{
    public static void main(String[] args)
    {
        boolean result = isAnagramString("rajesh","hsejar");
        System.out.println(result);
        result = isAnagramString(null,null);
        
        System.out.println(result);
    }

    private static boolean isAnagramString(String string,String string2)
    {
        
        if(string!=null && string2!=null && string.length()>0  ?  string.length()==string2.length() : false) {
            Map<Character, AtomicInteger> map = new HashMap<>();
            Map<Character, AtomicInteger> map2 = new HashMap<>();
            for(int i=0; i<string.length();i++) {
                Character charr = new Character(string.charAt(i));
                Character charr2 = new Character(string2.charAt(i));
                if(map.containsKey(charr)) {
                    map.get(charr).getAndIncrement();
                }else {
                    map.put(charr, new AtomicInteger(1));
                }
                if(map2.containsKey(charr2)) {
                    map2.get(charr2).getAndIncrement();
                }else {
                    map2.put(charr2, new AtomicInteger(1));
                }
            }
            for (Entry<Character, AtomicInteger> entry : map.entrySet())
            {
                if(map2.get(entry.getKey()) == null ){
                    return false;
                } else if(!map2.get(entry.getKey()).equals(map2.get(entry.getKey()))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean isAnagramByPermutation(int i, String str,String str2) {
        if(i>str.length()) {
            return false;
        }
        char[] charArr = str.toCharArray();
        swap(charArr, 0, 1, str2);
        swap(charArr, 1, 2, str2);
        swap(charArr, 2, 3, str2);
        swap(charArr, 3, 4, str2);
        swap(charArr, 4, 5, str2);
        return isAnagramByPermutation((i+1), str, str2);
    }
 
    private boolean swap(char[] charArr, int i, int j, String str2)
    {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] =  temp;
        
        return str2.equals(new String(charArr));
    }

    
    
    
    
}
