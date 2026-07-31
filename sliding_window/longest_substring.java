import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // If a duplicate is found, shrink the window from the left
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the window
            charSet.add(s.charAt(right));
            
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}