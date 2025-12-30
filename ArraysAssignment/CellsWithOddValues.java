package ArraysAssignment;

import java.util.Arrays;

public class CellsWithOddValues {
    public static void main(String[] args) {

        int m = 2;
        int n = 3;
        int[][] indices= {{0,1},{1,1}};

        int count = oddValueCount(m,n,indices);
        System.out.println(count);
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
                if(out[row][i] %2 ==0)
                {
                    oddCount -=1;
                }else{
                    oddCount+=1;
                }
            }
            for(int j = 0;j<m;j++)
            {
                out[j][col]++;
                if(out[j][col] %2 ==0)
                {
                    oddCount -=1;
                }else{
                    oddCount+=1;
                }
            }

        }
        System.out.println(Arrays.deepToString(out));


        return oddCount;
    }
}
