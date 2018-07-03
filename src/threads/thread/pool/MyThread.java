package my.thread.pool;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class MyThread extends Thread
{
    private PriorityBlockingQueue<Task> queue;
    private String threadName;

    public MyThread(PriorityBlockingQueue<Task> queue, String string)
    {
        this.queue = queue;
        threadName=string;
                
    }

    public void run()
    {
        System.out.println(this.threadName + " Started ");
        synchronized (queue)
        {
            while (true)
            {
                if (queue.isEmpty())
                {
                    try
                    {
                        try
                        {
                            Thread.sleep(1000);
                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                        
                        System.out.println("waited");
                        queue.wait();
                        
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println("Interuppoted");
                    }
                }

                Task task = queue.poll();
                if(task!=null) {
                    task.execute();
                }
                queue.notifyAll();               
            }
        }
    }
}
