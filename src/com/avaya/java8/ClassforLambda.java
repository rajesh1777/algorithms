package com.avaya.java8;

public class ClassforLambda
{
    FunctionInterfaceDemo demo;
    ClassforLambda(FunctionInterfaceDemo demo){
        this.demo = demo;
    }

    public void print()
    {
        demo.functionalMethod();
        demo.functionalMethod2();
    }
}
