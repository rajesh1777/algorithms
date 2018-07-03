package javaprg.java8.algo;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class DateTimeFormatterDemo
{
    public static void main(String[] args)
    {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().toFormatter(Locale.ENGLISH);
        
    }
}
