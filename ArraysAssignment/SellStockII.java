package ArraysAssignment;

public class SellStockII {
    public static void main(String[] args) {
        int[] profits = {7,1,5,3,6,4};
        //int[] profits = {1,2,3,4,5,6};
        System.out.println(profit(profits));
    }

    static int profit(int[] prices)
    {
        int profit = 0;
        int left = prices[0];
        int prev = prices[0];
        int currentProfit = 0;
        for (int i =1;i<prices.length;i++)
        {
            int right = prices[i];

            if( prev>right)
            {
                left = right;

            }else {
                currentProfit = Math.max(right-left,currentProfit);

            }
            if(left==right || i == prices.length-1)
            {

                profit +=currentProfit;
                currentProfit=0;
            }
            prev=right;
        }



        return profit;

    }
}
