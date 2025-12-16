# works on the sorted Array

Steps:

Assume sorted in the ascending order.

1. Find the middle element
2. if middle is less than the target than search in the right else search in the left
3. if the middle element == target answer found.

Best Case:

--> first middle element. O(1) constant time.

Worst case O(logn):

--> start == End


```
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
```

## Order Agnostic Binary Search

Step:

1. figure out sort order
2.
