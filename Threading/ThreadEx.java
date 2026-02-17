package Threading;

public class ThreadEx implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Using Runnable");
    }

    public static void main(String[] args) {
        ThreadEx ex = new ThreadEx();

       Thread t = new Thread(ex);

       t.start();

        System.out.println("Main method");
    }
}
