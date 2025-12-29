package ArraysAssignment;

public class RotationCountInSortedArray {
    public static void main(String[] args) {
        int[] arr= {15,18,19,2,3,6,12};
        int pi = rotationCount(arr);
        System.out.println(pi+1);
    }

    static int rotationCount(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        int pivot = -1;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1])
            {
                pivot=mid;
            }
            if( mid>start && arr[mid] < arr[mid-1])
            {
                pivot=mid-1;
            }
            if(arr[mid] <= arr[start])
            {
                end = mid-1;
            }else {
                start=mid+1;
            }
        }
        return pivot;
    }
}
