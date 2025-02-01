public class Swapping2Numbers {
    public static  void main(String[] args){
        int a =10,b=20;

        System.out.println("Before Swapping " + "a : "+a + " b: " + b);

        //Logic -1 using -- Third Variable
        int temp = a;
        a=b;
        b = temp;
        System.out.println("After Swapping using Third Varible " +"a : "+a + " b: " + b);


    }
}
