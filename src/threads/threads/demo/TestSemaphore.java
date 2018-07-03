package threads.threads.demo;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class TestSemaphore
{
    public static void main(String[] args)
    {
        Semaphore sema = new Semaphore(1);
        AtomicInteger value = new AtomicInteger();
        Thread thread = new Thread(new MyThread(sema,value));
        Thread thread2 = new Thread(new MyThread2(sema,value));
        thread2.start();
        thread.start();
    }
}
