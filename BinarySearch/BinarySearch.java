package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {1,5,9,45,78,88};

        System.out.println(binarySearch(nums,5));
    }

    static int binarySearch(int[] arr,int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end)
        {
            //find the mid-value in the while loop as start/end will change after every iteration.
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }

        return -1;
    }
}
