package LeetCode;

public class RichestCustomer1672 {
    public static void main(String[] args) {

        int[][] accounts = {{1,2,3},{3,2,1}};


        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts)
    {
        int max = Integer.MIN_VALUE;
        for(int[] account: accounts)
        {
            int sum = 0;
            for(int amount : account)
            {
                sum+=amount;
            }

            if(sum>max){
                max=sum;
            }
        }

        return max;
    }



}
