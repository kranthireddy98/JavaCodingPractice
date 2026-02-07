package Bit;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2,3,2,5,4};

        int x = 0;
        for(int j : arr){
            x ^= j;
        }

        System.out.println(x);
    }


}
