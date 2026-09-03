import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<Integer>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Count characters in p
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }

        int windowSize = p.length();

        // Create the first window
        for (int i = 0; i < windowSize; i++) {
            windowCount[s.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = windowSize; i < s.length(); i++) {

            // Add the new character
            windowCount[s.charAt(i) - 'a']++;

            // Remove the old character
            windowCount[s.charAt(i - windowSize) - 'a']--;

            // Check if current window is an anagram
            if (Arrays.equals(pCount, windowCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}
output:
nput
s =
"cbaebabacd"
p =
"abc"
Output
[0,6]
Expected
[0,6]
