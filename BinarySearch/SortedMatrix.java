package BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));

    }

    static int[] binarySearch(int[][] mat,int row,int cStart,int cEnd,int target)
    {
        while (cStart<=cEnd)
        {
            int mid = cStart + (cEnd - cStart)/2;

            if(mat[row][mid] == target)
            {
                return new int[]{row,mid};
            }
            else if(mat[row][mid] > target)
            {
                cEnd=mid-1;
            }else {
                cStart=mid+1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] mat,int target)
    {
        int rows=mat.length;
        int cols = mat[0].length;

        if(rows == 1)
        {
            return binarySearch(mat,0,0,cols-1,target);
        }
        if(cols ==0)
        {
            return new int[] {-1,-1};
        }

        int rStart =0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while (rStart< (rEnd-1))// true till have more than 2 rows
        {
            int mid = rStart + (rEnd-rStart)/2;
            if(mat[mid][cMid] == target)
            {
                return new int[] {mid,cMid};
            }

            if(mat[mid][cMid] > target)
            {
                rEnd = mid;
            }
            else {
                rStart =mid;
            }
        }

        //two rows left
        // if target is in the mid
        if (mat[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (mat[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search 1 st row 1st half
        if(target<= mat[rStart][cMid-1])
        {
            return binarySearch(mat,rStart,0,cMid-1,target);
        }
        // search 1 st row 2nd half
        if(target>= mat[rStart][cMid+1] && target <= mat[rStart][cols - 1])
        {
            return binarySearch(mat,rStart,cMid+1,cols-1,target);
        }
        // search 2nd row 1st half
        if(target<= mat[rStart +1][cMid-1])
        {
            return binarySearch(mat,rStart +1,0,cMid-1,target);
        }
        else {
            return binarySearch(mat, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
