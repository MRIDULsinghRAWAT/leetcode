class GFG {

    public static boolean isPalindrome(String s) {
return s.equals(new StringBuilder(s).reverse().toString());    
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrome(s));
    }
}