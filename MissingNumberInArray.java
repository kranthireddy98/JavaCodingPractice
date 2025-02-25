import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        //Array should not have duplicates
        // Array No need to be sorted order
        // values should be in range

        int[] a = {1,2,3,4,6};

        // Get sum of all Elements
        // get sum of range
        // difference of range - elements
        int sum1  = 0;
        int sum2 = 0;
        for (int i =0;i<a.length; i++){
            sum1+=a[i];
        }

       int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();

        for (int j = min;j<=max;j++){
            sum2+=j;
        }

System.out.println(sum2-sum1);

    }
}
