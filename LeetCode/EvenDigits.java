package LeetCode;

public class EvenDigits {


    public static void main(String[] args)
    {
           int[] nums = {18,124,9,176,986,1};

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums)
    {
        int even = 0;

        for(int i =0;i<nums.length;i++)
        {

            if(digits(nums[i]) %2 ==0)
            {
                even+=1;
            }
        }
        return even;
    }

    static int digits(int num)
    {
        int count =0;

        while (num>0)
        {
            count++;

            num=num/10;
        }

        return count;
    }
}
