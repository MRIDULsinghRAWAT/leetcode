package AMCAT_PREP.amcat_prev.AMCAT_PREP.strings.java;

public class leetcode_151 {
    public String reverseWords(String s) {
        // logic:
        // Step 1: Trim leading and trailing spaces
        // Step 2: Split the string by one or more spaces
        // Step 3: Reverse the array of words
        // Step 4: Join the reversed words with a single space

        // using 2 pointers
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();

    }
    
}
