import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {5,8,3,9,10,10,12,15,19,9};

        for (int i =0; i<ar.length;i++)
        {
            for (int j =0;j<ar.length -i-1;j++)
            {
                System.out.println(i + " " +j);
                if (ar[j] > ar[j+1])
                {
                    int temp = ar[j+1];
                    ar[j+1] = ar[j];
                    ar[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
