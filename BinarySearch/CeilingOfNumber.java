package BinarySearch;

public class CeilingOfNumber {

    public static void main(String[] args) {

        int [] nums = {2,3,5,9,14,16,18};
        int target = 19;
        int ceil = ceiling(nums,target);
        if (ceil == -1)
        {
            System.out.println("Target is greater than the greatest number in the list");

        }else
        {System.out.println(nums[ceil]);
    }
    }

    static  int ceiling(int[] nums,int target)
    {
        int length = nums.length;
        if(target > nums[length-1]) return -1;

        int start = 0;
        int end = length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target)
            {
                end =mid-1;
            }
            else {
                start = mid+1;
            }
        }
        
        return start;
    }
}
