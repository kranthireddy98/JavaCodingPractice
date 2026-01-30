package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*### Keywords for sliding window:

        “longest”

        “substring”

        “no repeating”

        “contiguous”*/
public class LongestSubstringWithoutRepeating {




    public static void main(String[] args) {

        int max = lengthOfLongestSubstringHs("abcabcbb");
        int mexx = lengthOfLongestSubstringHm("abcabcbb");
        int mx = lengthOfLongestSubstringBf("abcabcbb");
        System.out.println(max);
        System.out.println(mexx);
        System.out.println(mx);

    }

    //Hash Set + sliding window
    private static int lengthOfLongestSubstringHs(String s) {
        int res = 0;

        int left =0;


        HashSet<Character> chars = new HashSet<>();

        for(int right =0;right<s.length();right++){

            while (chars.contains(s.charAt(right))){
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(right));
            res = Math.max(res,right-left+1);
        }

        return res;
    }
    private static int lengthOfLongestSubstringHm(String s){
        int res = 0;

        int left =0;

        //using hashmap so that directly jump to +1 of the duplicate index previous occurrence
        HashMap<Character,Integer> charsMap = new HashMap<>();

        for(int right = 0;right<s.length();right++){
            if(charsMap.containsKey(s.charAt(right))){
                left=Math.max(left,charsMap.get(s.charAt(right)) + 1);
            }
            charsMap.put(s.charAt(right),right);
            res = Math.max(res,right-left+1);
        }
        return res;
    }



    //Brute force
    private static int lengthOfLongestSubstringBf(String s) {

        int res =0;
        //Loop through every possible starting point
        for(int i =0;i<s.length();i++){

            //loop through every ending point
            for (int j =i+1; j<s.length();j++){

                Set<Character> chars = new HashSet<>();
                boolean hasDuplicate=false;
                for(int k = i;k<=j;k++){
                    char c = s.charAt(k);
                   if(chars.contains(c)){
                      hasDuplicate=true;
                   }
                   chars.add(c);
                }
                if(!hasDuplicate){
                    res=Math.max(j-i+1,res);
                }


            }
        }
        return res;

    }
}
