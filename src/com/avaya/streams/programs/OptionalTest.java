package com.avaya.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest
{
    public static void main(String[] args)
    {
        final String nullValue = null;
        final String value = "Rajesh";
        Optional<String> valueOpt = Optional.of(value);
        Optional<String> test = Optional.ofNullable(nullValue);
        //System.out.println("test " + test.isPresent());
        
        System.out.println(test.orElseGet(()-> "test"));;
        
       // System.out.println(test.orElse("Else"));
        
//        final String value = cluster.getName();
//        Optional<String> optionNullable = Optional.ofNullable(nullValue);
//        optionNullable.orElse("defaulf");
//        optionNullable.orElseGet(mapper);
        
        
        final List<String> list = Arrays.asList("Rajesh", null , "Kakadwar");
        list.stream().filter(e1 -> Optional.ofNullable(e1).isPresent()).map(e->e.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        //list.stream().filter(e1 -> Optional.ofNullable(e1).isPresent()).collect(Collectors.toList()).forEach(System.out::println);
        
    }
}
