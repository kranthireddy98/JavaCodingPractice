package ArraysAssignment;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        int[][] accounts = {{1,2,3},{3,2,1}};
        int maxWealth = maximumWealth(accounts);//6
        System.out.println(maxWealth);
    }

    static public int maximumWealth(int[][] accounts) {
        int maxi=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum +=accounts[i][j];
            }
            if(sum>maxi){
                maxi=sum;
                //maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }
}
