package com.avaya.streams.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamProgram
{
    public static void main(String[] args)
    {
        final List<Integer> list = Arrays.asList(13,51,6,3,3,21,1,2,3,12,23,7,89,5,23,57,8,5,3);
        
        list.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);
        
        //System.out.println("" + sorted);
        
        final List<Integer> filterEven = list.stream().filter(e->(e%2 == 0)).collect(Collectors.toList());

        System.out.println(filterEven);
        System.out.println(list.stream().max((e1,e2) -> e1.compareTo(e2)));
        System.out.println(list.stream().distinct().sorted().collect(Collectors.toList()));
                
        final Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }   
}
