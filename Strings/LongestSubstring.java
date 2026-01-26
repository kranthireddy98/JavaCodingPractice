package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {

    public int lengthOfLongestSubstringHm(String s) {

        HashMap<Character,Integer> lastSeen = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int right = 0;right<s.length();right++){
            char currentChar = s.charAt(right);
            if(lastSeen.containsKey(currentChar) && lastSeen.get(currentChar) >= left){
                left = lastSeen.get(currentChar) + 1;
            }
            lastSeen.put(currentChar,right);
            max = Math.max(max,right-left +1);

        }
        return max;
    }

    public static int lengthOfLongestSubstringHs(String s) {

        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for(int right = 0;right<s.length();right++){
            char current = s.charAt(right);
           while (set.contains(current)){
               set.remove(s.charAt(left));
               left++;
           }
           set.add(current);
           max = Math.max(max,right-left+1);

        }
        return max;
    }

    public static void main(String[] args) {

        int max = lengthOfLongestSubstringHs("abcabcbb");
        System.out.println(max);
    }
}
