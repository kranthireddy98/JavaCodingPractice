
public class CountNoOfDigits {
    public static void main(String[] args) {

        //divide by 10 and count numbers
        int num = 12435;
        System.out.println(num);
        int count = 0;

        while (num>0){
            num=num/10;
            count+=1;
        }
        System.out.println(count);
    }
}
