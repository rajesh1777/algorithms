package javaprg.java8.algo;

@FunctionalInterface
public interface FunctionInterfaceDemo
{
    default void functionalMethod()
    {
        System.out.println("functionalMethod");
    }
    abstract void functionalMethod2();
}
