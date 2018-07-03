package com.avaya.java8;

public class FuncInterfaceImpl implements FuncInter2, FunctionInterfaceDemo
{

    @Override
    public void functionalMethod2()
    {
        
        
    }

    @Override
    public void functionalMethod()
    {
        FunctionInterfaceDemo.super.functionalMethod();
    }

}
