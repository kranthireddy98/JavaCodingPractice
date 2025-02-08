import java.util.Scanner;

public class SumOfDigitsInANumber {
    public static void main(String[] args) {
        int sum = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter A Number : ");
       int number = sc.nextInt();
        while(number>0){
            int last = number%10;
            number = number/10;
            sum+=last;
        }

        System.out.println("Sum of Digits of Given Number : " + sum);
    }
}
