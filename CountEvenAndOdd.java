public class CountEvenAndOdd {
    public static void main(String[] args) {
        int num = 10254;
        int even = 0;
        int odd = 0;



        while (num>0){

            int last = num%10;
            if (last%2==0){
                even++;
            }else {
                odd++;
            }
            num=num/10;
        }
        System.out.println("Even :" + even+" " + "Odd : " +odd );
    }
}
