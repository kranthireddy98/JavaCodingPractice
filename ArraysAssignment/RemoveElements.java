package ArraysAssignment;

import java.util.Arrays;

public class RemoveElements {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            while(nums[right] == val){
                right--;
            }
            while(nums[left] != val){
                left++;
            }

            int temp = nums[left];
            nums[left] =nums[right];
            nums[right] = temp;
            left++;
            right--;
            count++;
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(nums.length - count -1);
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int[] nums1 ={0,1,2,2,3,0,4,2};
        int val = 3;
        removeElement(nums,2);
    }
}
