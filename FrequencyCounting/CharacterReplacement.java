package FrequencyCounting;

public class CharacterReplacement {

    public int characterReplacement(String s, int k) {
        int[] counts = new int[26]; // To store frequency of 'A'-'Z'
        int left = 0;               // Left boundary of window
        int maxFreq = 0;            // Max frequency of a single char in current window
        int maxLen = 0;             // Result

        for (int right = 0; right < s.length(); right++) {
            // 1. Expand: Add the new character to the frequency map
            int rightCharIdx = s.charAt(right) - 'A';
            counts[rightCharIdx]++;

            // 2. Update maxFreq: Is the new character now the most frequent?
            maxFreq = Math.max(maxFreq, counts[rightCharIdx]);

            // 3. Validate: If (window size - maxFreq) > k, we have too many "others"
            while ((right - left + 1) - maxFreq > k) {
                // Shrink: Remove the character at 'left' from counts
                int leftCharIdx = s.charAt(left) - 'A';
                counts[leftCharIdx]--;
                // Move the left pointer forward
                left++;

                // Note: We don't strictly need to decrease maxFreq here.
                // A smaller maxFreq won't give us a better result than what we've found.
            }

            // 4. Update Result: The window is now valid
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
