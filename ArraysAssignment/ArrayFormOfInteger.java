package ArraysAssignment;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormOfInteger {
    public static void main(String[] args) {
        //int[] num ={9,9,9,9,9,9,9,9,9,9};
        int[] num = {2,7,4};
        int k =181;

        List<Integer> res = addToArrayForm(num,k);
        System.out.println(res);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> res = new ArrayList<>();
        int i = num.length - 1;

        // Keep going as long as there are digits in 'num' OR there is still a value in 'k' (carry)
        while (i >= 0 || k > 0) {

            // 1. Add the digit from the array to k (if we haven't run out of digits)
            if (i >= 0) {
                k += num[i];
                i--;
            }
            System.out.println(k);

            // 2. The digit we want to keep is k % 10
            res.add(k % 10); // Adding at index 0 pushes numbers to the right

            // 3. The carry to move to the next left position is k / 10
            k /= 10;
            System.out.println(k);
        }
        Collections.reverse(res);

        return res;
    }
}
