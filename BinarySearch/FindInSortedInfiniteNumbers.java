package BinarySearch;

public class FindInSortedInfiniteNumbers {

    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,10};
        int target = 7;
        System.out.println(ans(nums,target));
    }

    static int ans(int[] arr, int target)
    {
        // first find the range
        // first start with a box of size 2

        int start  =0;
        int end =1;
        //condition for the target to lie in the range
        while(target > arr[end])
        {

                int newstart=end+1;
                //double the box
                end= end + (end - start + 1 * 2);

                start =newstart;

        }
        return binarySearch(arr,7,start,end);

    }

    static int binarySearch(int[] arr,int target,int start,int end) {


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
