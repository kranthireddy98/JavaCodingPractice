package PrefixSum;

import java.util.Arrays;

public class ProductExceptSelf {

    public  static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] res = new int[n];

        res[0] = 1;

        for(int i = 1; i<n;i++){
            res[i] = res[i -1] * nums[i-1];
        }
        //[1, 1, 2, 6]
        int right = 1;
        for(int j =n-1;j>=0;j--){
            res[j] = right * res[j];

            right = right* nums[j];
        }

        return res;
    }
}
