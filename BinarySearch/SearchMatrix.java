package BinarySearch;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 50;

        search(mat,target);
    }

    static void search(int[][] mat,int target)
    {
        int row = 0;
        int col = mat[0].length-1;
        while (row<mat[0].length && col>=0)
        {
            System.out.println("t");
            if(mat[row][col] == target)
            {
                System.out.println(row + " " + col);
                return;
            } else if (mat[row][col] > target) {
                col--;
            }else {
                row++;
            }
        }
    }
}
