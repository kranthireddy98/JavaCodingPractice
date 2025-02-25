import  java.util.Arrays;

public class EqualityOfArrays {
    public static void main(String[] args) {

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        // Approach 1
        boolean status = Arrays.equals(a1,a2);

        System.out.println(status?"Equal":"Not Equal");

        //Approach -- 2
        //--> length should be equal
        boolean compStatus = true;

        if (a1.length == a2.length){
            for (int i =0; i<a1.length;i++){
                if(a1[i] != a2[i]){
                    compStatus=false;
                    break;
                }
            }
        }else {
            compStatus=false;
        }

        System.out.println(compStatus?"Equal" : "Not Equal");
    }
}
