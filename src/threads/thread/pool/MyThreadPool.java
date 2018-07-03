package my.thread.pool;

import java.util.concurrent.PriorityBlockingQueue;

public class MyThreadPool
{
    private PriorityBlockingQueue<Task> queue;
    private Thread[] threads;
    public MyThreadPool(int initial) {
        queue = new PriorityBlockingQueue<>();
        threads = new MyThread[initial];
        for(int i=0;i<initial;i++) {
            threads[i] = new MyThread(queue, "Thread"+i);
            threads[i].start();
        }
    }
    public void assignedTask(final Task task) {
        synchronized (queue)
        {
            queue.put(task);
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            queue.notifyAll();
        }
        
    }
    public static void main(String[] args)
    {
      
        MyThreadPool pool =new MyThreadPool(4);
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
                
        for (int i = 0; i < 1000 ; i++)
        {
            System.out.println("Assigning");
            Task task1 = new Task1();
            Task task11 = new Task1();
            Task task12 = new Task1();
            Task task21 = new Task2();
            Task task22 = new Task2();
            Task task23 = new Task2();
            
            pool.assignedTask(task21);
            pool.assignedTask(task22);
            pool.assignedTask(task23);
            pool.assignedTask(task1);
            pool.assignedTask(task11);
            pool.assignedTask(task12);
            pool.assignedTask(task21);
            pool.assignedTask(task22);
            pool.assignedTask(task23);
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
