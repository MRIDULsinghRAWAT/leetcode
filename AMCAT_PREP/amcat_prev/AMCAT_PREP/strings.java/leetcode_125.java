package AMCAT_PREP.amcat_prev.AMCAT_PREP.strings.java;

public class leetcode_125 {
    public boolean isPalindrome(String s) {
        // logic:
       StringBuilder rev = new StringBuilder();

for (int i = s.length() - 1; i >= 0; i--) {
    rev.append(s.charAt(i));
}

if (s.equals(rev.toString())) {
    return true;
}
return false;

    
}
}

