package Threading;



public class PubSub {

    public static void main(String[] args) {

        Topic topic = new Topic();
        Producer producer = new Producer(topic);
        Consumer consumer = new Consumer(topic);

        Thread poducerThread = new Thread(producer);

        Thread consumerThread =  new Thread(consumer);

        poducerThread.start();
        consumerThread.start();
    }

}
