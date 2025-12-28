package ArraysAssignment;

public class MaProfit {

    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
        int max = 0;

        for (int i =0; i<prices.length;i++)
        {
            for (int j = i+1;j<prices.length;j++)
            {
                max= Math.max((prices[j]-prices[i]),max);
            }
        }

        return max;
    }
}
