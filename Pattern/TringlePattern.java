package Pattern;

public class TringlePattern {

    public static void main(String[] args) {

        pattern1(5);
        System.out.println();
        patter2(4);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
    }

    public static void pattern1(int n){

        System.out.println("pattern 1");
        for (int row = 1; row<=n;row++){

            for (int col =0;col<n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patter2(int n){
        System.out.println("pattern 2");
        for (int row = 0; row <n; row++){

            //for every row, run the col
            for (int col=1; col<=row;col++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }
    public static void pattern3(int n){
        System.out.println("pattern 3");

        for(int row =0; row<n;row++){
            for (int col =1;col<n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        System.out.println("pattern 4");
        for (int row =1;row<=n;row++){

            for (int col = 1;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        System.out.println("pattern 5");
        for(int row = 1;row<=2*n-1;row++){
            if(row<=n){
                for (int col = 1;col<=row;col++){
                    System.out.print("* ");
                }
            }else {
                for (int col = 1; col<2*n - row  +1;col++){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

    public static void pattern6(int n){
        System.out.println("pattern 6");
        for (int row = 0;row<n;row++){
            for (int col=1;col<=n;col++){
                int val = n-row;
                if(col < val){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
