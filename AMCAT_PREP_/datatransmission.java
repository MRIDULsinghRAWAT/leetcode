import java.util.Scanner;

public class datatransmission {

    public static int unchangedCharacters(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt(n - 1 - i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data string: ");
        String data = sc.nextLine();

        int result = unchangedCharacters(data);

        System.out.println("Number of unchanged characters: " + result);
    }
}