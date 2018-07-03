package threads.threads.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter
{
    private final AtomicInteger counter = new AtomicInteger(0);
    public void printCounter() {
        System.out.println(counter.incrementAndGet());
    }
}
