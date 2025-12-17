package ArraysAssignment;

import java.util.Arrays;

public class ArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

        int[] res = buildArray(nums);
        System.out.println(Arrays.toString(res));
    }

    static public int[] buildArray(int[] nums) {

        int[] out  =new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            out[i] = nums[nums[i]];
        }

        return out;
    }
}
