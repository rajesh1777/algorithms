package my.threads.demo;

public class ExecuteThreadinSeq
{
    private static Thread th1 = new Thread(() -> {
        try
        {
            synchronized (Resource.class)
            {
                while (true)
                {
                    if (Resource.seq == 1)
                    {
                        System.out.println("A");
                        //Thread.sleep(1000);
                        Resource.seq = 2;
                        Resource.class.notifyAll();
                        
                    } else {
                        Resource.class.wait();
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    });

    private static Thread th2 = new Thread(() -> {
        try
        {
            synchronized (Resource.class)
            {
                while (true)
                {
                    if (Resource.seq == 2)
                    {
                        System.out.println("B");
                        //Thread.sleep(1000);
                        Resource.seq = 3;
                        Resource.class.notifyAll();
                    }else {
                       
                        Resource.class.wait();    
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    });
    private static Thread th3 = new Thread(() -> {
        try
        {
            synchronized (Resource.class)
            {
                while (true)
                {
                    if (Resource.seq == 3)
                    {   
                        System.out.println("C");
                        System.out.println("========");
                        //Thread.sleep(1000);
                        Resource.seq = 1;
                        Resource.class.notifyAll();   
                    } else {
                        Resource.class.wait();
                    }
                                    
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    });

    public static void main(String[] args)
    {
        Resource.seq = 1;
        th1.start();
        th2.start();
        th3.start();
    }

    static class Resource
    {
        public static volatile int seq = 1;
    }
}
