package Recursion;

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(helper(14,0));
    }

    static int helper(int n, int c){
        if(n ==0){
            return c;
        }

        int r = n%2;

        if(r ==0){
            return helper(n/2,c+1);
        }else {
            return helper(n-1,c+1);
        }
    }
}
