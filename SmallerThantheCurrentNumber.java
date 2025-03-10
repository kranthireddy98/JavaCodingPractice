import java.util.Arrays;

public class SmallerThantheCurrentNumber {
    public static void main(String[] args) {
        //leet code 1365

        int[] nums = {8,1,2,2,3,99,88};
        int[] frequency = new int[101];
        int[] result = new int[nums.length];
        // Step 1: Count frequency of each number
        for (int num : nums){
            frequency[num]++;
        }

        System.out.println(Arrays.toString(frequency));
        // Step 2 : compute prefix sum
        for (int i =1; i<101;i++){
            frequency[i] += frequency[i -1];
            //System.out.println(Arrays.toString(frequency));
        }
      //  System.out.println(Arrays.toString(frequency));
        //Fill Result Array
        for (int i =0;i<nums.length;i++)
        {
            result[i] = nums[i]==0 ? 0:frequency[nums[i] -1];
        }
        System.out.println(Arrays.toString(result));
    }
}
