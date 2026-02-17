package Threading;

public class Consumer implements Runnable{
    private Topic topic ;

    public Consumer(Topic topic){
        this.topic=topic;
    }
    @Override
    public void run() {



        try {
            while (true){
                topic.consumer();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
