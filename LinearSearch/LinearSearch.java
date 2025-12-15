package LinearSearch;

public class LinearSearch {

    public static void main(String[] args)
    {

        int[] nums = {23,45,67,2,45,-9,6,77,-99,857};
        int target = 77;
        int index = linearSearch(nums,target);

        System.out.println("Element found at the index : " + index);
    }

    //search in the array: return the index of the item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length ==0)
        {
            return -1;
        }

        for(int i =0; i<arr.length;i++)
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
