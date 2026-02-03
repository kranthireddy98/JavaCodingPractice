package SlidingWindow;

public class MaximumAvg {

    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 1;
        double avg = findMaxAverage(nums,k);
        System.out.println(avg);
    }

    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.MIN_VALUE;
        int sum = 0;
        int left  = 0;

        for (int right = 0; right<nums.length;right++){
            sum+=nums[right]; // add right

            if(right - left + 1 == k){ // Required window size of k

                double avg = (double) sum / k;
                maxAvg = Math.max(maxAvg,avg);

                sum-=nums[left]; // remove left from new sum
                left++;
            }
        }
        return maxAvg;
    }
}
