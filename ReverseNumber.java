import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");

        int num = sc.nextInt();

        //1. Using algorithm

        int rev = 0;
        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        System.out.println(rev);

        //using StringBuffer Class
        StringBuffer sb = new StringBuffer(String.valueOf(rev));

        StringBuffer reverse = sb.reverse();

        System.out.println("Reverse Number is :" + reverse);

        //StringBuilder class
        StringBuilder bulder = new StringBuilder();
        bulder.append(reverse);
        int iknt= Integer.parseInt(bulder.reverse().toString());
        System.out.println("Builder Reverse :" + iknt);

    }
}
