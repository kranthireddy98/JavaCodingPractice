package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class MaximumAvg {

    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 1;
        double avg = findMaxAverage(nums,k);
        System.out.println(avg);

        System.out.println(8/3);

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);

        dq.pollLast();
        System.out.println(dq);
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
