package Recursion;

import java.util.List;

public class DigitsSum {

    static int sumDigits(int n)
    {
        if(n==0) return 0;

        return (n%10) + sumDigits(n/10);

    }

    static int nToOne(int n)
    {
        if(n ==0) return 0;

        System.out.println(n);

        return nToOne(n-1);
    }


    static boolean isPalindrome(String s,int left, int right)
    {

        if(left >=right ) return true;

        if(s.charAt(left) != s.charAt(right))
        {
            return false;
        }

        return isPalindrome(s,left+1,right-1);
    }

    public static void main(String[] args) {

        nToOne(5);
        System.out.println(isPalindrome("madam",0,4));
        /*int sum = sumDigits(123);
        System.out.println(sum);*/
    }
}
