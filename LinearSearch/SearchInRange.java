package LinearSearch;

public class SearchInRange {

    public static void main(String[] args)
    {

        int[] nums = {23,45,67,2,45,-9,6,77,-99,857};
        int target = 857;
        int index = linearSearchInRange(nums,target,4,8);

        System.out.println("Element found at the index : " + index);
    }

    //search in the array: return the index of the item found
    //otherwise if item not found return -1
    static int linearSearchInRange(int[] arr, int target,int start,int end) {
        if(arr.length ==0)
        {
            return -1;
        }

        for(int i =start; i<end;i++)
        {
            int element= arr[i];

            if(element == target)
            {
                return i;
            }

        }

        return -1;
    }
}
