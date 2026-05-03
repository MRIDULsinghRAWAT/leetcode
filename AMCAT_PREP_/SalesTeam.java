import java.util.Scanner;

public class SalesTeam {
    
    // This is the algorithm to calculate the OrderID
    public static int calculateOrderID(int n, int[] products) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+products[i];


        }
        return sum;
        
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter number of product types: ");
            int n = sc.nextInt();
            
            int[] products = new int[n];
            System.out.println("Enter the " + n + " product quantities:");
            for (int i = 0; i < n; i++) {
                products[i] = sc.nextInt();
            }
            
            // Calling the algorithm
            int result = calculateOrderID(n, products);
            
            System.out.println("\n----------------------------");
            System.out.println("The generated OrderID is: " + result);
            System.out.println("----------------------------");
            
        } catch (Exception e) {
            System.out.println("Error: Please enter valid integer numbers.");
        } finally {
            sc.close();
        }
    }
}