package Threading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class AtomicInt {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();

        ai.set(2);

        System.out.println(ai.get());

        System.out.println(ai.addAndGet(4));
        System.out.println(ai.getAndAdd(2));
        System.out.println(ai.compareAndExchange(8,3));
        System.out.println(ai.get());

        LongAdder lA = new LongAdder();

        lA.add(1);

        System.out.println(lA.sum());
    }
}
