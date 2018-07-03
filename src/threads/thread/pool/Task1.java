package threads.thread.pool;

public class Task1 implements Task
{

    @Override
    public void execute()
    {
        System.out.println("Task1 executed");

    }

    @Override
    public int compareTo(Object o)
    {
        return -1;
    }

}
