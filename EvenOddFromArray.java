public class EvenOddFromArray {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,6,6,8,7};

        for(int num : numbers){
            if (num%2==0){
                System.out.println("Even : " + num);
            }
            else {
                System.out.println("Odd : " + num);
            }
        }
    }
}
