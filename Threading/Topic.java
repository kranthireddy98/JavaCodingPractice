package Threading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Topic {
    public static Queue<String> messages = new LinkedList<>();
    public static int capacity =5;
    private   BlockingQueue<String> messageQue = new ArrayBlockingQueue<>(10);

    public  void producer(String message) throws InterruptedException {
        /*while (capacity == messages.size()){
            wait();
        }
        messages.add(message);
        notifyAll();*/
        //System.out.println(message);
        messageQue.put(message);
        System.out.println("Produced " + message);
        System.out.println(Thread.currentThread().getState());
        //System.out.println("queue "+messageQue.poll());
    }

    public  void consumer() throws InterruptedException {
       /* while (messages.isEmpty()){
            wait();
        }
        String message = messages.poll();
        System.out.println(message);
        notifyAll();*/
        String me = messageQue.take();
        System.out.println(me);
    }
}
