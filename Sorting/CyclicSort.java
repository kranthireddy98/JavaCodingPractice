package Sorting;

import java.util.Arrays;

/**
 * When Give range is 1 to N use Cycle sort
 */
public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        int[] arr1 = {5,4,3,2,1,0};

        sort(arr1);

        System.out.println(Arrays.toString(arr1));;
    }

    private static void sort(int[] arr) {

            int i =0;
            while(i<arr.length )
            {
                //correct = nums[i] -1;
                int correct = arr[i];
                if(arr[i] != arr[correct]) {

                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }else {
                    i++;
            }
        }
    }

}
