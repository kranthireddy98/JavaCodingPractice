package Threading;

public class ThreadExtends extends Thread{

    public void run(){
        System.out.println("thread");
    }

    public static void main(String[] args) {
        ThreadExtends ex = new ThreadExtends();

        ex.start();
        System.out.println("Main Thread");

        Thread t1 = new Thread(() -> {
            System.out.println("Functional Thread");
        });
        t1.start();
    }
}
