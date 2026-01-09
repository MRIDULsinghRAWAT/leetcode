package AMCAT_PREP.strings.java;

public class leetcode_242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(map.containsKey("s")){
                    return true;
                }

            }
            return false;
        }
    // logic :
    //i will use hashmap 
    // 



    /**Example 1:

Input: s = "anagram", t = "nagaram"

Output: true */
}
}
