package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kranthi";
        String b = "Kranthi";

        /*
        1. == -> checks if reference variables pointing to same object.
         */
        System.out.println(a == b);

        String s = new String("Kranthi");

        System.out.println(a == s);// false
        /*
        2. .equals() -> checks is the actual value is same.
         */
        System.out.println(a.equals(s));//true

    }
}
