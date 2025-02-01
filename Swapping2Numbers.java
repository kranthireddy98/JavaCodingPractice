public class Swapping2Numbers {
    public static  void main(String[] args){
        int a =10,b=20;

        System.out.println("Before Swapping " + "a : "+a + " b: " + b);

        //Logic -1 using -- Third Variable
        int temp = a;
        a=b;
        b = temp;
        System.out.println("After Swapping using Third Varible " +"a : "+a + " b: " + b);

        //Logic -- 2 use + & - without using third variable

        a = a+b; // a=30
        b=a-b ;// 30-10 = 20
        a = a-b; //30-20 = 10
        System.out.println("After Swapping using use + & - " +"a : "+a + " b: " + b);

        //Logic -- 3 use * and / without using third variable
        // -- if a and b are not zero

        a = a*b; //20*10 = 200
        b = a/b; //200/20 = 10
        a = a/b;  // 200/10 = 20

        System.out.println("After Swapping using * and / " +"a : "+a + " b: " + b);

        // Logic -- 4 use Bitwise XOR (^) Operator
        a = a^b; // 20 ^ 10 = 30
        b = a^b; // 30 ^ 10 = 20
        a = a^b; // 30 ^ 20 = 10
        System.out.println("After Swapping using Bitwise XOR (^) Operator " +"a : "+a + " b: " + b);

        // Logic -- 5 Single Statement
        //<-------------
        b = a+b - (a=b);
        System.out.println("After Swapping using Single Statement " +"a : "+a + " b: " + b);
    }
}
