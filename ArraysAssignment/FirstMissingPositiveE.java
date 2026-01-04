package ArraysAssignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Leet code : 41
public class FirstMissingPositiveE {
    public static void main(String[] args) {

        int [] nums = {3, 4, -1, 1};
        int missing = firstMissingPositive2(nums);
        System.out.println(missing);
    }

    /*
        1. Find the max element in the Array
        2. Loop from 1 to max element in the array and check if the value existing in the array if no return it
        if all exists return max +1

        Drawback :
        If the array contains a huge number (like 1,000,000,000), the second loop will take a long time to run. In a professional interview, you can improve this by realizing that the answer must be between $1$ and nums.length + 1
    */
    public static int firstMissingPositive1(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

            int max = 0;

            for(int num : nums)
            {
                if(num>max)
                {
                    max =num;
                }
                if(!map.containsKey(num))
                {
                    map.put(num,num);
                }
            }
            int missing =max+1;

            for(int j =1;j<=max;j++)
            {
                if(!map.containsKey(j))
                {
                    return j;
                }
            }
            return missing;

        }


      /*
           1. Loop through the array. If nums[i] is a positive number <= N and it’s not in its right place, swap it with the number that is currently in its right place.
           2. After swapping, loop through again. The first index $i$ where nums[i] != i + 1 tells you that $i + 1$ is missing.
     */
    public static int  firstMissingPositive2(int [] nums) {

        int len = nums.length;

        //1. Cyclic Sort: put each number in right place
        /*
        Number 1 should go to index 0.
        Number 2 should go to index 1.
        Number 3 should go to index 2.
         */
        for(int i = 0; i<len;i++)
        {

            while(nums[i] >0 && nums[i] <= len && nums[nums[i] -1] != nums[i]  )
            {
                int targetIndex = nums[i] -1;
                int temp = nums[i];
                nums[i] = nums[targetIndex];
                nums[targetIndex] = temp;
                System.out.println(Arrays.toString(nums));
            }
            System.out.println(Arrays.toString(nums));
        }

        //2. find the first index that doesn't match its value
        /*
            index 0 should be 1
            index 1 should be 2

            index 0+1 == 1
        */
        for(int i =0; i<len;i++)
        {
            if(nums[i] != i+1)
            {
                return i+1;
            }
        }



        return len+1;
    }
}
