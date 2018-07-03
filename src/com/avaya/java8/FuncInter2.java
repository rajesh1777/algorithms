package com.avaya.java8;

@FunctionalInterface
public interface FuncInter2
{
    default void functionalMethod()
    {
        System.out.println("functionalMethod");
    }
    abstract void functionalMethod2();
}
