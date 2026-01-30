package Recursion;

import java.util.ArrayList;
import  java.math.BigInteger;

public class FibonacciSeries {
    public static void main(String[] args) {

         int fib = fibo(50);
        System.out.println(fib);

    }

    static int fibo(int n){
        if(n <2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static  ArrayList<BigInteger> fibo1 (int n){

        ArrayList<BigInteger> fibb= new ArrayList<>();
        fibb.add(BigInteger.ZERO);
        fibb.add(BigInteger.ONE);
        for (int i=2;i<n;i++){
            fibb.add(fibb.get(i-1).add(fibb.get(i-2)));

        }

        return  fibb;
    }
}
