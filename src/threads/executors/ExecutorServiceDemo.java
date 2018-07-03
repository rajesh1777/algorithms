package my.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo
{
    public static void main(String[] args)
    {
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        Future<String>  result = service.submit(new Callable<String>()
        {
            @Override
            public String call() 
            {
                try
                {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e)
                {
                   System.out.println("Interrupted");
                }
                return "Test";
            }
            
        });
       
        service.shutdownNow();
        try
        {
            service.awaitTermination(1, TimeUnit.DAYS);
        }
        catch (InterruptedException e1)
        {
            e1.printStackTrace();
        }
        try
        {
            System.out.println("value :" + result.get());
        }
        catch (InterruptedException | ExecutionException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
