package ArraysAssignment;

public class ZeroSubArray {


    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.println(zeroFilledSubarray(nums));
    }
    public static long zeroFilledSubarray(int[] nums) {
        long cnt = 0, streak = 0;
        for (int num : nums) {
            streak = (num == 0) ? streak + 1 : 0;
            cnt += streak;
        }
        return cnt;
    }
}
