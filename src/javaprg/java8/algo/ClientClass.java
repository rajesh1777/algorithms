package javaprg.java8.algo;

public class ClientClass
{
public static void main(String[] args)
{
 ClassforLambda lambda = new ClassforLambda(()-> {
     System.out.println("This is for Lambda");
 });
 lambda.print();
}
}
