package my.threads.demo;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThread2 implements Runnable
{

    private Semaphore semaphore;
    private AtomicInteger value;
    public MyThread2(Semaphore sema, AtomicInteger value)
    {
        this.semaphore = sema;
        this.value = value;
    }

    @Override
    public void run()
    {
        while(true) {
            try
            {
                this.semaphore.acquire();
                Thread.sleep(1000l);
                System.out.println("Before Acquiring "+ value.getAndIncrement());
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }finally {
                this.semaphore.release();
            }
        }
    }

}
