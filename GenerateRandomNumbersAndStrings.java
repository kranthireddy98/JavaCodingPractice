import  java.util.Random;


public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args) {
        //Approach 1 -- Random

        Random rand = new Random();
        System.out.println(rand.nextInt(1000));//max limit is 999

       Double db = rand.nextDouble();//range 0.0 to 1.0
    System.out.println(db);

    //Approach - 2 -- Math
       System.out.println( Math.random());

       //Approach -- 3 -- Appache commons
    }
}
