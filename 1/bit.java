// wap to verify if the kth bit of the number is set or not 


/** System.out.println((n&(1<<k))!=0)? "set":"not set"; */ 
//yeh h soln. 





public class bit {
    public static void main(String[] args) {
        int n = 5; // binary representation: 101
        int k = 1; // checking the 1st bit (0-indexed)
        
        if (isKthBitSet(n, k)) {
            System.out.println("The " + k + "th bit of " + n + " is set.");
        } else {
            System.out.println("The " + k + "th bit of " + n + " is not set.");
        }
    }
    
    public static boolean isKthBitSet(int n, int k) {
        return (n & (1 << k)) != 0;
    }
}

/** System.out.println((n&(1<<k))!=0)? "set":"not set"; */ 
//yeh h soln. 