import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");

        String str = sc.next().toString();

        //1) Using + (string concatenation) operator
        int len = str.length();

        String rev="";

        for (int i = len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(str + " reverse : " + rev);

        //2. Using Character array

        char a[] = str.toCharArray();
        int lengt = a.length;
        String reversed="";
        for (int j = lengt-1;j>=0;j--){
            reversed += a[j];
        }
        System.out.println("reversed character array :" + reversed);

        //3.Using String Buffer class
        StringBuffer sb = new StringBuffer(str);
        String reve = sb.reverse().toString();
        System.out.println("reversed String Buffer:" + reve);
    }
}
