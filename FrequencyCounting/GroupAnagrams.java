package FrequencyCounting;

import java.util.*;

public class GroupAnagrams {


    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();


        for(String s : strs){
            int[] freq = new int[26];

            for (char c : s.toCharArray()){
                freq[c -'a']++;
            }

            //convert frequency array to string key
            String key = Arrays.toString(freq);
            System.out.println(key);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams1(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for (String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);

            map.putIfAbsent(key,new ArrayList<>());

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagramsBrute(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[strs.length]; // tracks already grouped strings

        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }

    // helper to check if two strings are anagrams
    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] freq = new int[26]; // assuming lowercase letters
        for (char c : a.toCharArray()) freq[c - 'a']++;
        for (char c : b.toCharArray()) freq[c - 'a']--;

        for (int count : freq)
            if (count != 0) return false;

        return true;
    }
}
