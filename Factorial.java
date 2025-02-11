public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        long fact =1;

        for (int i =1;i<=5;i++){
            fact*=i;
        }

        System.out.println(factr(0));
    }

    static long factr(int num){

        System.out.println("num :" + num);
        if (num==0 || num ==1){
            return 1;
        }
        return num * factr(num-1);
    }
}
