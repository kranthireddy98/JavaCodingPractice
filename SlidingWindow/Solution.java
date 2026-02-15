package SlidingWindow;

import java.util.List;

class Solution {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3,-2,1,4);
        int l =2;
        int r =3;
        minimumSumSubarray(nums,l,r);
    }
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        
        int min =0;

        for(int i = l; i<=r;i++){
            int k = i;

            int left =0;
            int sum  =0;
            for (int right = 0;right<nums.size();right++){
                sum += nums.get(right);

                if(right - left + 1 == k){

                    min = Math.min(min,sum);

                    sum-=nums.get(left);
                    
                    left++;
                }
            }
        }

        return min;
    }
}