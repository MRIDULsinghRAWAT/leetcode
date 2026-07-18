package AMCAT_PREP.amcat_prev.AMCAT_PREP.strings.java;

public class leetcode_387 {
    public int firstUniqChar(String s) {
        //logic
        // Create an array to store the frequency of each character
        // Assuming the input string contains only lowercase letters
        // so we can use an array of size 26
        // Iterate through the string and count the frequency of each character
        // Iterate through the string again and find the first character with frequency 1
        // Return its index, or -1 if no such character exists
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                return i;
            }
        }
        return -1;
        
    }
    }
    

