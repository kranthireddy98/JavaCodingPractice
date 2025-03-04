import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {


        //Approach 1
        //Array should not have duplicates
        // Array No need to be sorted order
        // values should be in range

        int[] a = {0,1};

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

        // Approach 2
        //If n= no of distinct numbers
        // If range is (0,n)
        int n= 6;
        int missed = a.length* (a.length+1)/2 - Arrays.stream(a).sum();
        System.out.println(missed);

        //Approach 3 XOR
        // if we XOR something with 0, it will return the same number.
        //ex: 5^0 = 5
        //if we XOR 2 same number the output will be 0.
        //ex: 5^5=0
        //if we XOR 2 different number result nothing
        // ex: 4^5 = 4^5

        int size = a.length;
        int ans = 0;
        for (int i =1;i<=size; i++){

            ans=ans^i;

        }
        for (int i =0;i<size; i++){
            ;
            ans=ans^a[i];

        }
        System.out.println(ans);

        //Using Vectors
        int[] v = new int[size+1];
        Arrays.fill(v,-1);
        System.out.println(Arrays.toString(v));//-1,-1,-1...
        for (int i =0;i<a.length;i++){
            v[a[i]] = a[i];
        }
        for (int i=0;i<v.length;i++){
            if(v[i] == -1) System.out.println(i);
        }
    }
}
