import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortingElementsInBuiltMethods {
    public static void main(String[] args) {
        // Approach 1
        int[] a = {30,5,50,8,66,7};



        System.out.println(System.currentTimeMillis());
        Arrays.parallelSort(a); //available from Java 8

        System.out.println(System.currentTimeMillis());
        System.out.println(Arrays.toString(a));
        a[0] = 30;
                a[1]=5;
                a[2] =50;
                a[3] = 8;
                a[4] =66;
                a[5] =7;
        System.out.println(Arrays.toString(a));
        System.out.println(System.currentTimeMillis());
        //Arrays.sort(a);

        System.out.println(System.currentTimeMillis());
        System.out.println(Arrays.toString(a));

        Integer[] ab = {30,5,50,8,66,7};
        Arrays.sort(ab,Collections.reverseOrder());// Primitive types is not Supported
        System.out.println(Arrays.toString(ab));

        comparision();
    }

    static void comparision(){

        int size = 100000;
        int[] ar1 = new int[size];
        int[] ar2 = new int[size];

        Random random = new Random();
        for (int i = 0; i<size;i++){
            int num = random.nextInt(100000);
            ar1[i] = num;
            ar2[i] = num;
        }

        long start1 = System.currentTimeMillis();
        Arrays.sort(ar1);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        Arrays.parallelSort(ar2);
        long end2 = System.currentTimeMillis();

        System.out.println(Arrays.toString(ar1));
        System.out.println("sort " + (end1 - start1) +" Parallel Sort " + (end2 - start2) );

    }
}
