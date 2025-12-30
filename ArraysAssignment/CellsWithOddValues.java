package ArraysAssignment;

import java.util.Arrays;

public class CellsWithOddValues {
    public static void main(String[] args) {

        int m = 2;
        int n = 3;
        int[][] indices= {{0,0},{1,1}};

        int count = oddValueCount(m,n,indices);

    }

    static int oddValueCount(int m, int n, int[][] indices)
    {
        int[][] out = new int[m][n];

        int oddCount = 0;
        for (int[] indice : indices)
        {
            int row=indice[0];
            int col = indice[1];

            for(int i = 0;i<n;i++)
            {
                out[row][i]++;
            }
            for(int j = 0;j<m;j++)
            {
                out[j][col]++;
            }

        }
        System.out.println(Arrays.deepToString(out));

        for (int row = 0;row<m;row++)
        {

        }
        return oddCount;
    }
}
