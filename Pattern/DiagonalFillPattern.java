package Pattern;

import java.util.Arrays;

public class DiagonalFillPattern {


    public static void main(String[] args) {
        int N = 5;
        int[][] arr= new int[N][N];
        int num = 1;

        for (int i =0;i<N*2;i++){
            int row;
            int col;
            if(i<N) {
                row=0;
                col=i;
            }else {
                row = i -N+1;
                col = N-1;
            }
            while (col>=0 && row<N){
                arr[row][col] = num++;
                row++;
                col--;
            }

        }
       /* for (int i =1;i<N;i++){
            int row =i;
            int col =N-1;
            while (col>=0 && row<N){
                arr[row][col] = num++;
                row++;
                col--;
            }

        }*/

        for (int[] ar : arr)
        {
            System.out.println(Arrays.toString(ar));
        }

    }
}
