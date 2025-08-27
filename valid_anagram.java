class Solution {
    public boolean isAnagram(String s, String t) {

// t ke elemnts s mei ho to anagram 

if(s.length()!=t.length()){
    return false;
}
    // character count 
    int [] count =new int[26];

    // s ka character count kia 
 for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i); 
    count [c-'a']++;   // count badha 
 }

      // ab t ka count kia 
        for (int i = 0; i < t.length(); i++) {
    char c = t.charAt(i); 
    count [c-'a']--;   // count kaam kia 
 
 if(count[c -'a']<0){  // -ve hua to 
return false;
 }
 }
 return true;
    }
}