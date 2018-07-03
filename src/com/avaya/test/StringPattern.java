package com.avaya.test;

import com.sun.istack.internal.NotNull;

public class StringPattern
{
    public static void main(String[] args)
    {
        String line = "SssRqSssRespiiesSssReisleSss";
        String patternToSearch = "SssR";
        
        searchPattern(line, patternToSearch);
        searchPatternRecursively(0,line, patternToSearch);
        
    }

    private static void searchPatternRecursively(int i, String line, String patternToSearch)
    {
        int patLen = patternToSearch.length();
        if(i>=line.length() || (patLen+i) > line.length()) {
            return;
        }
        searchPatternRecursively((i+1), line, patternToSearch);
        
        //System.out.println(i);
        
        if(patternToSearch.equals(line.substring(i, (patLen + i)))) {
            System.out.println(i);
        }        
    }

    private static void searchPattern(@NotNull String line,@NotNull String patternToSearch)
    {
        int i=0;
        int patLen = patternToSearch.length();
        while(i<line.length() && (patLen+i) <= line.length()) {
            if(patternToSearch.equals(line.substring(i, (patLen+i)))) {
                System.out.println(i);
            }
            i++;
        }        
    }
    
    
}
