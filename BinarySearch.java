public class BinarySearch {
    /* Array elements needs to be in sorted order
     find mid element
     if target Greater than mid search in right side of mid
     else search in left side
    */
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int target = 3;
        int result = binary(arr,target);
        System.out.println(result);
    }

    static int binary(int[] arr,int target ){


        int l = 0;
        int r = arr.length-1;


        while (l<=r){
            int mid = (l+r) /2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                l = mid+1;

            }else {
                r = mid-1;
            }
        }
        return -1;
    }
}
