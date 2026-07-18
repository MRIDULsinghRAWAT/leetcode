package AMCAT_PREP.strings.java;

public class leetcode_242 {
    public boolean isAnagram(String s, String t) {
       //logic change to arrays
       // sort them 
       //compare -> if equal true.
       char[] ch1=s.toCharArray();
       char[]ch2=t.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
       if(Arrays.equals(ch1,ch2)){

        return true;
    }return false;
}
} 
  


    /**Example 1:

Input: s = "anagram", t = "nagaram"

Output: true */

