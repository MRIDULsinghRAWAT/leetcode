import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Digicomparts {

    /**
     * Function to count desktop products (consonants).
     * @param n Total number of products
     * @param productIDs Array of product ID characters
     * @return count of desktop product IDs
     */
    public static int countDesktopProducts(int n, char[] productIDs) {
        if (n <= 0 || productIDs == null) {
            return 0;
        }

        // Define laptop products (vowels) for quick lookup
        String vowels = "aeiouAEIOU";
        int desktopCount = 0;

        for (int i = 0; i < n; i++) {
            char current = productIDs[i];
            
            // If the character is not a vowel, it's a desktop product
            if (vowels.indexOf(current) == -1) {
                desktopCount++;
            }
        }

        return desktopCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of products
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            char[] ids = new char[n];

            // Input: Product IDs
            for (int i = 0; i < n; i++) {
                ids[i] = sc.next().charAt(0);
            }

            // Output result
            System.out.println(countDesktopProducts(n, ids));
        }
        sc.close();
    }
}