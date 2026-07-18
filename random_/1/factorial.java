//package 1;

public class factorial {

    /**
     * 
     * int n=5;
     * int fac=1;
     * for(int i=0;i<n;i++){
     * fac=fac*(i+1);
     * }sopln(fac);
     */
// using recursiojn ! 


    // Recursive method to calculate factorial
    static int calculateFactorial(int n) {
        // Base case
        if(n <= 1) {
            return 1;
        }
        // Recursive case
        return n * calculateFactorial(n - 1);
    }
    
    public static void main(String[] args) {
        int n = 5;
        int result = calculateFactorial(n);
        System.out.println(result);  
    }
}
