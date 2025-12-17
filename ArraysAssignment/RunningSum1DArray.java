package ArraysAssignment;

import java.util.Arrays;

public class RunningSum1DArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);//[1, 3, 6, 10]

        System.out.println(Arrays.toString(result));
    }

    static public int[] runningSum(int[] nums) {

        int length = nums.length;
        if(length<1) return new int[length];
        int[] runningSum = new int[length];

        runningSum[0] = nums[0];
        for(int i =1;i<length;i++)
        {
            runningSum[i] = runningSum[i-1] + nums[i];
        }

        return runningSum;
    }
}
