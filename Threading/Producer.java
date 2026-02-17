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
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
