public class LinearSearch {
    public static void main(String[] args) {
        int[] ar = {34,44,54,65,34};
        int target = 44;
        int result = li(ar,target);

    }

    static int li(int[] ar,int target){

        for (int i =0; i<ar.length;i++){
            if(ar[i] == target){
                return i;
            }
        }
        return -1;
    }
}
