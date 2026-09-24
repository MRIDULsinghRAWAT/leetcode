public class Main {
    public static void main(String[] args) {
        int n = 12;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;  // get last digit
            sum = sum + digit;   // add digit
            n = n / 10;          // remove last digit
        }

        System.out.println(sum);
    }
}