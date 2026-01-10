package Strings;

import java.util.ArrayList;
import java.util.List;

//Leet Code 392
public class IsSubSequence {

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgcde";
        System.out.println(isSubsequence(s,t));
    }

    /**
     *Two  Pointer Approach
     * i,j within th boundaries
     * if s[i] == t[j] move i
     * if i moved to end already it means subsequence not possible even though all the chars in s are in t
     * order also matters
     */

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
