package ArraysAssignment;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrent {

    public static void main(String[] args) {
        int [] nums= {8,1,2,2,3};

        //System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        smallerNumbersThanCurrentFreq(nums);
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        HashMap<Integer, Integer> res = new HashMap<>();
        int[] coppied = Arrays.copyOf(nums, nums.length);
        Arrays.sort(coppied);
        for (int i = 0; i < nums.length; i++)
        {
            if(!res.containsKey(coppied[i]))
            {
                res.put(coppied[i],i);
            }

        }

        for(int j = 0; j<nums.length;j++)
        {
            result[j] = res.get(nums[j]);
        }
        System.out.println(res);

        return result;
    }

    static int[] smallerNumbersThanCurrentFreq(int[] nums) {
        int[] result = new int[nums.length];

        int[] freq = new int[101];

        for (int num : nums)
        {
            freq[num]++;
        }
        System.out.println(Arrays.toString(freq));
        for (int i =1;i<=100;i++)
        {
            freq[i] += freq[i -1];
        }

        for (int j =0;j<nums.length;j++)
        {
            result[j] = freq[nums[j]] -1;
        }

        System.out.println(Arrays.toString(freq));

        return result;
    }
}
