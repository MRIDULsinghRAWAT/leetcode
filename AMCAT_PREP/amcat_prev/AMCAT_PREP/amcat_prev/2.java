package AMCAT_PREP.amcat_prev;

public class 2 {
    /**2. Frequency of Characters in a String
You are given a lowercase string. Your task is to count the frequency of each character present in the string.

The output should display only the characters that appear in the string, sorted in alphabetical order, along with their frequency.

Input:
A string S.

Output:
Each character followed by ':' and its count.
 */
    public static void main(String[] args) {
        String str="abacbda";
        int[] freq=new int[26]; // 26 lowercase letters
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++; // frequency count

        }
    

