package SlidingWindow;

public class minSubArrayLenPr {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1};
        int target = 11;
        int len = minSubArrayLen(target,nums);
        System.out.println(len);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int right =0;right <nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                min = Math.min(min,right-left+1);
                sum -= nums[left++];
            }

        }

        return min == Integer.MAX_VALUE ? 0 :  min;
    }
}
