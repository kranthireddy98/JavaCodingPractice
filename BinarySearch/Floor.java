package BinarySearch;

public class Floor {

    public static void main(String[] args) {
        int [] nums = {2,3,5,9,14,16,18};
        int target = 1;
        int floor = floor(nums,target);
        if (floor == -1)
        {
            System.out.println("Target is less than the least number in the list");

        }else
        {System.out.println(nums[floor]);
        }
    }
    static  int floor(int[] nums,int target)
    {
        int length = nums.length;
        if(target < nums[0]) return -1;

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

        return end;
    }
}
