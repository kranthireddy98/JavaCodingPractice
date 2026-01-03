package ArraysAssignment;

public class IncreasingTriplet {
    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};
        boolean out = increasingTriplet(nums);
        System.out.println(out);
    }
    public static boolean increasingTriplet(int[] nums) {
            // Start with the largest possible values
            int small = Integer.MAX_VALUE;
            int mid = Integer.MAX_VALUE;

            for (int num : nums) {
                System.out.println("Small : " + small + " middle : " + mid);
                if (num <= small) {
                    // Found a new smallest value
                    small = num;
                } else if (num <= mid) {
                    // Found something bigger than small, but could be our middle
                    mid = num;
                } else {
                    // If it's bigger than both small and mid, we have a triplet!
                    return true;
                }
            }

            return false;
        }

}
