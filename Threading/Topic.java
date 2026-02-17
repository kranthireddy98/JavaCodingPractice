package Threading;

import java.util.LinkedList;
import java.util.Queue;

public class Topic {
    public static Queue<String> messages = new LinkedList<>();
    public static int capacity =5;

    public synchronized void producer(String message) throws InterruptedException {
        while (capacity == messages.size()){
            wait();
        }
        messages.add(message);
        notifyAll();
    }

    public synchronized void consumer() throws InterruptedException {
        while (messages.isEmpty()){
            wait();
        }
        String message = messages.poll();
        System.out.println(message);
        notifyAll();
    }
}
