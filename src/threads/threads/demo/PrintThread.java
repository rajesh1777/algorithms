package threads.threads.demo;

public class PrintThread implements Runnable
{
    
    private Counter cnt;

    public PrintThread(Counter cnt)
    {
        this.cnt = cnt;
    }

    @Override
    public void run()
    {
        cnt.printCounter();
    }

}
