package javaprg.java8.algo;

@FunctionalInterface
public interface FuncInter2
{
    default void functionalMethod()
    {
        System.out.println("functionalMethod");
    }
    abstract void functionalMethod2();
}
