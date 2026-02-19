package Threading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Topic {
    public static Queue<String> messages = new LinkedList<>();
    public static int capacity =5;
    public static BlockingQueue<String> messageQue = new ArrayBlockingQueue<>(10);

    public synchronized void producer(String message) throws InterruptedException {
        /*while (capacity == messages.size()){
            wait();
        }
        messages.add(message);
        notifyAll();*/

        messageQue.add(message);
    }

    public synchronized void consumer() throws InterruptedException {
       /* while (messages.isEmpty()){
            wait();
        }
        String message = messages.poll();
        System.out.println(message);
        notifyAll();*/
        String me = messageQue.poll();
        System.out.println(me);
    }
}
