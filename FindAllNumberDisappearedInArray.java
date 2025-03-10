import java.util.Arrays;

public class FindAllNumberDisappearedInArray {
    public static void main(String[] args) {
       int[] nums= {4,3,2,7,8,2,3,1};

       for (int i =0;i<nums.length;i++){
           int index = Math.abs(nums[i]) - 1;
           if(nums[index] >0){
               nums[index] = -nums[index];

           }
           System.out.println(Arrays.toString(nums));
       }
    }
}
