import java.util.ArrayList;
import  java.math.BigInteger;

public class FibonacciSeries {
    public static void main(String[] args) {

        ArrayList<BigInteger> fib = fibo(100);
        System.out.println(fib);




    }

    static  ArrayList<BigInteger> fibo (int n){

        ArrayList<BigInteger> fibb= new ArrayList<>();
        fibb.add(BigInteger.ZERO);
        fibb.add(BigInteger.ONE);
        for (int i=2;i<n;i++){
            fibb.add(fibb.get(i-1).add(fibb.get(i-2)));

        }

        return  fibb;
    }
}
