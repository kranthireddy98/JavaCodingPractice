package Sorting;

import java.util.Arrays;

/**
 *Select an Element and put it at correct index
 *Performs well on the small list
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {4,5,1,2,3};
        sort(arr);
        System.out.println((Arrays.toString(arr)));
    }

    public static void sort(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            //find the max value in the remaining array
            // swap with correct index
            int last = arr.length-i-1;
            int maxIndex = maxIndex(arr,0,last);
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;


        }


    }

    public static int maxIndex(int[] arr,int start,int last)
    {
        int max = start;

        for(int i =1;i<last;i++)
        {
            if(arr[i] > arr[max])
            {
                max=i;

            }
        }
        return max;
    }
}
