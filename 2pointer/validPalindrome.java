package 2pointer;

 public boolean isPalindrome(String s) {
        //2 pointer 
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l)))  // leave special characters and spaces 
                l++;
            else if (!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                    // compare their are they in lower case 
                    return false;
                l++;
                r--;
            }
        }
        return true;
    }
}