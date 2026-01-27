package Recursion;

public class Factorial {

    static int fact(int n )
    {
        if(n==0) return 1;

        System.out.println("n " + n);
        int x = n * fact(n-1);
        System.out.println("x "+ x);
        return x;
    }

    static int fact4(int n){
        return n * fact3(n - 1);
    }

    static int fact3(int n){
        return n * fact2(n - 1);
    }

    static int fact2(int n){
        return n * fact1(n - 1);
    }

    static int fact1(int n){
        return 1;
    }

    public static void main(String[] args) {
        int res  = fact4(4);
        System.out.println(res);
    }
}
