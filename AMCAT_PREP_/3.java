import java.util.Scanner;

public class SalesTeam {
    
    /**
     * Algorithm to calculate the OrderID (Total Sum of Products)
     * @param n - Number of product types
     * @param products - Array containing quantities for each product type
     * @return The sum of all product quantities
     */
    public static int calculateOrderID(int n, int[] products) {
        


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Input: Number of product types
            System.out.print("Enter number of product types: ");
            int n = sc.nextInt();
            
            // Input: Quantities for each type
            int[] products = new int[n];
            System.out.println("Enter the " + n + " product quantities (space-separated):");
            for (int i = 0; i < n; i++) {
                products[i] = sc.nextInt();
            }
            
            // Execute the algorithm
            int result = calculateOrderID(n, products);
            
            // Output the result
            System.out.println("\n----------------------------");
            System.out.println("Generated OrderID: " + result);
            System.out.println("----------------------------");
            
        } catch (Exception e) {
            System.out.println("Error: Please provide valid integer inputs.");
        } finally {
            sc.close();
        }
    }
}