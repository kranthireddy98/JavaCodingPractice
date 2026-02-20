package Threading;

public class Producer implements Runnable {
    private Topic topic;
    public Producer(Topic topic) {
        this.topic=topic;
    }

    @Override
    public void run() {

        int count = 0;
        try {
            while (true){
                topic.producer("Message: "+ count++);
                System.out.println("Producer: "+count);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
