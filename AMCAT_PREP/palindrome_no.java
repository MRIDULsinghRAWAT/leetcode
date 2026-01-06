package amcat_prep;

public class palindrome_no {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;  // last digit 
            rev = rev * 10 + digit; // reverse
            num = num / 10;// last digit remove
        }

        if (original == rev) {
            System.out.println(original + " is a palindrome number");
        } else {
            System.out.println(original + " is not a palindrome number");
        }

    


    }

    
}
