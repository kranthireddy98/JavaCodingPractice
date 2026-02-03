package Bit;

import java.util.Arrays;
import java.util.List;

public class BinaryPalindrome {


    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(2,7);

        System.out.println(getDistanceSum(data));
    }

    private static int getDistanceSum(List<Integer> data) {

        int distance = 0;
        for(int num : data){
            distance+=palindromeDistance(num);
        }
        return distance;
    }

    private static int palindromeDistance(int num) {
        if(isPalindrome(num)){
            return 0;
        }

        int dist = 1;
        while (true) {
            if (num - dist >= 0 && isPalindrome(num - dist)) {
                return dist;
            }

            if (isPalindrome(num + dist)) {
                return dist;
            }
            dist++;
        }
    }

    private static boolean isPalindrome(int num) {
        if (num < 0) return false;
        int original = num;
        int reversed = 0;

        // Reverse the bits of num
        int temp = num;
        while (temp > 0) {
            reversed = (reversed << 1) | (temp & 1);
            temp >>= 1;
        }

        return original == reversed;
    }

    private static boolean isPalindromeb(int num) {
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);

        int left =0;
        int right = binary.length()-1;

        while (left<right){

            if(binary.charAt(left) != binary.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
