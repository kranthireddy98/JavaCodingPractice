public class MaxAndMinInArray {
    public static void main(String[] args) {
        int a[] = {1,54,87,93};

        int max= a[0] , min = a[0];

        for (int i : a){
            if(i>max) max=i;
            if(i<min) min=i;
        }

        System.out.println("Max : " + max +" Min : " + min);
    }
}
