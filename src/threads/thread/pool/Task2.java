package my.thread.pool;

public class Task2 implements Task
{

    @Override
    public void execute()
    {
        System.out.println("Task2 executed");
    }

    @Override
    public int compareTo(Object o)
    {
        return 1;
    }

}
