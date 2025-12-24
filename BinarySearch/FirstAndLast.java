package BinarySearch;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = {-1,-1};
        res[0] =firstAndLast(nums,target,true);
        res[1] =firstAndLast(nums,target,false);

        System.out.println(Arrays.toString(res));
    }

    static int firstAndLast(int[] nums,int target,boolean isStart)
    {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if(nums[mid] == target)
            {
                ans = mid;
                if(isStart) {

                    end = mid - 1;
                }
                else {
                    start = mid+1;
                }
            } else if (nums[mid] > target) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

    return ans;
    }

}
