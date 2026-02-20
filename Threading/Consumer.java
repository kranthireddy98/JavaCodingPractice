package Threading;

public class Consumer implements Runnable{
    private Topic topic ;

    public Consumer(Topic topic){
        this.topic=topic;
    }
    @Override
    public void run() {



        try {
            int count = 0;
            while (true){
                topic.consumer();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
