package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {23,45,67,2,45,-9,6,77,99,857};
       
        System.out.println(min(nums));
    }

    static int min(int[] nums)
    {
        int min = nums[0];

        for (int i =1;i<nums.length;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
        }

        return min;
    }
}
