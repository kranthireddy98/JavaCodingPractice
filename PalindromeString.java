import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");

        String str = sc.nextLine();

        String Orignal_String = str;
        String revString ="";

        int len = str.length();

        for(int i = len-1;i>=0;i--){
            revString = revString+ str.charAt(i);

        }

        System.out.println(revString);
        if(revString.equals(Orignal_String)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

    }
}
