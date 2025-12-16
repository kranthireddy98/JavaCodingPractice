package BinarySearch;

public class OrderAgnosticBinary {

    public static void main(String[] args) {
        int[] nums = {1,5,9,45,78,88};

        int[] arr = {98,89,77,4,3,2,1};
        System.out.println(orderAgnosticBS(nums,5));
        System.out.println(orderAgnosticBS(arr,1));

    }
    static int orderAgnosticBS(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        boolean isASC = arr[start] < arr[end];

        while (start <= end)
        {
            //find the mid-value in the while loop as start/end will change after every iteration.
            int mid = start + (end - start)/2;

            if(isASC)
            {
                if(arr[mid] < target)
                {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            else {
                if(arr[mid] < target)
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            if(arr[mid] == target)
            {
                return mid;
            }

        }

        return -1;
    }
}
