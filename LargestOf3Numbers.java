public class LargestOf3Numbers {
    public static void main(String[] args) {
        int a =100, b =200, c = 300;

        // Approach 1
        if(a>b && a>c){
            System.out.println("a is greater");
        }else  if (b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }

        //Approach 2 - terinary operator
        int largest = (a>b?a:b)>c?(a>b?a:b):c;
        int larg = c>largest?a:largest;
        System.out.println(largest);
    }
}
