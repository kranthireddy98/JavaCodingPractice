package ArraysAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {
    public static void main(String[] args) {

        rotate();
    }

    static void rotate()
    {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        List<Integer> out = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        for(int i= 0;i<k;i++)
        {
           out.add((nums.length-1+1) % nums.length,out.get(nums.length-1));
           out.remove(out.size() -1);
        }

        nums  = out.stream()
                .mapToInt(i -> i) // Maps Integer objects to int primitives
                .toArray();
        System.out.println(out);
        System.out.println(Arrays.toString(nums));
    }
}
