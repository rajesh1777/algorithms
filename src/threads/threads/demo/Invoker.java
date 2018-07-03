package threads.threads.demo;

public class Invoker
{
    public static void main(String[] args)
    {
        final Counter cnt = new Counter();
        Thread thread1 = new Thread(new PrintThread(cnt));
        Thread thread2 = new Thread(new PrintThread(cnt));
        Thread thread3 = new Thread(new PrintThread(cnt));
        Thread thread4 = new Thread(new PrintThread(cnt));
        Thread thread5 = new Thread(new PrintThread(cnt));
        Thread thread6 = new Thread(new PrintThread(cnt));
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
