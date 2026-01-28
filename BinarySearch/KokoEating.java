package BinarySearch;

public class KokoEating {
    public static int minEatingSpeed(int[] piles, int h) {
        int maxPile = 5;

        /*for (int p : piles){
            maxPile = Math.max(maxPile,p);
        }
*/
        int min = 1;
        int answer = maxPile;

        while(min<= maxPile){
            int mid = min + (maxPile - min)/2;

            long hours = 0;
            for (int p : piles){
                hours += (p + mid-1 ) / mid;
            }
            if(hours > h){
                min = mid + 1;
            }else{
                answer =mid;
                maxPile=mid-1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int[] piles1 = {805306368,805306368,805306368};
        int h = minEatingSpeed(piles1,1000000000);
        System.out.println(h);
    }
}