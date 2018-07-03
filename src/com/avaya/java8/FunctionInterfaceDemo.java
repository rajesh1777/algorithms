package com.avaya.java8;

@FunctionalInterface
public interface FunctionInterfaceDemo
{
    default void functionalMethod()
    {
        System.out.println("functionalMethod");
    }
    abstract void functionalMethod2();
}
