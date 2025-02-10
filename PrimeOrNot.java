import  java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();

        int count = 0;
        for (int i=2;i * i <=number;i++){
            System.out.println(i*i);
            if(number%i ==0){
                count++;
            }
        }

        System.out.println(count);
        if (count==0){
            System.out.println(number+" is Prime Number");
        }else {
            System.out.println(number + " not a Prime");
        }
    }
}
