package ArraysAssignment;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] res = getConcatenation(nums);//[1, 2, 1, 1, 2, 1]
        System.out.println(Arrays.toString(res));

    }

    static public int[] getConcatenation(int[] nums) {

        int length = nums.length;
        int[] result = new int[length * 2];

        for(int i =0;i<length;i++)
        {
            int current = nums[i];
            result[i] = current;
            result[i+length] = current;

        }

        return result;
    }
}
