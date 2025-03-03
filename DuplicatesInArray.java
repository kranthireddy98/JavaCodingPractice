import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicatesInArray {
    public static void main(String[] args)
    {
            int[] nums = {1,2,3,4,4};

            boolean flag = false;
            //Approach 1
            //Brute force
            for (int i = 0;i<nums.length;i++)
            {
              for(int j=i+1;j<nums.length;j++)
              {
                  if (nums[i]==nums[j])
                  {
                      flag=true;
                      System.out.println("Found Duplicate");
                  }

              }
            }
            if(!flag) System.out.println("No Duplicates");


            //Approach 2
            // convert to set and compare lengths
            //Set<Integer> set = new HashSet<>(Arrays.asList(nums));
            Set<Integer> set1 = IntStream.of(nums)
                                            .boxed()
                                                .collect(Collectors.toSet());

            if(set1.size() != nums.length){
                System.out.println("Found Duplicate");
            }else {
                System.out.println("No Duplicates");
            }

            //Approach 3
            Set<Integer> set2 = new HashSet<>();
            boolean fl = false;
            for(int num : nums){
                if(set2.add(num) == false)
                {
                    fl = true;
                    System.out.println("Found Duplicate");
                }

            }
            if(!fl){
                System.out.println("No Duplicates");
            }
    }

}

