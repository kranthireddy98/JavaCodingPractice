import java.util.Arrays;

import static java.lang.Math.max;

public class StockSell {
    public static void main(String[] args) {
        int[] prices = {7,2,5,2,6,9};
        int l =0,r=1;
        int max = 0;

        while (l<r & r<prices.length){

            if (prices[l] > prices[r]){

                l=r;
            }
            System.out.println(prices[r]+":"+r + " " + prices[l]+":"+l);
            max = max(max,prices[r] - prices[l]);
            r+=1;
        }

        System.out.println(max);
    }
}
