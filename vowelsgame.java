class Solution {
    public boolean doesAliceWin(String s) {
        
        // basic hogagaya
for(int i=0;i<s.length();i++){ //<= nahi warna out of bound
    char ch= s.charAt(i);

if(isVowel(ch)){
return true;

  }
}
return false;
    }

// privat func declare 
private boolean isVowel(char ch){
    return "aeiouAEIOU".indexOf(ch)!=-1;
    //.indexOf(ch) check karega ki given character string ke andar hai ya nahi.
    }
}
