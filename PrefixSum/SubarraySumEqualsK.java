package PrefixSum;

import java.util.HashMap;

//Leet code 560
public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int target =2;
        int res = subarraySumHM(nums,target);
        System.out.println(res);
    }

    public static int subarraySum(int[] nums, int target) {

        int result = 0;
        for(int i = 0;i<nums.length;i++){

            for (int j = i;j<nums.length;j++){
                int sum =0;
                for (int k = i; k<=j;k++){
                    sum+=nums[k];
                }
                if(sum==target){
                    result++;
                }
            }
        }

    return result;
    }

    //Prefix Sum + HashMap
    public static int subarraySumHM(int[] nums, int target) {

        int result = 0;

        //Map stores: <Prefix,Frequency>
        HashMap<Integer,Integer> map = new HashMap<>();

        //BASE CASE: A prefix sum of 0 has been seen once (empty subarray)
        map.put(0,1);

        int  currentSum = 0;
        for(int num : nums ){
            currentSum += num;

            //check if (currentSum -k) exists in our history
            if(map.containsKey(currentSum - target)){
                result += map.get(currentSum - target);
            }

            //Update the map with the current prefix sum
            map.put(currentSum,map.getOrDefault(currentSum,0) + 1);
        }
        return result;
    }
}
