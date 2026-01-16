package AMCAT_PREP.strings.java;

public class leetcode_3 {
    public int lengthOfLongestSubstring(String s) {
        // logic:
        // using sliding window and hashset
        java.util.Set<Character> set=new java.util.HashSet<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<s.length()){
            char ch=s.charAt(right);//
            if(!set.contains(ch)){
                set.add(ch);
                right++;
                maxlen=Math.max(maxlen, right-left);
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}