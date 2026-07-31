// without using +,-
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            // Step 1: Carry calculate karo
            int carry = (a & b) << 1;
            
            // Step 2: Bina carry ke sum nikaalo aur 'a' mein store karo
            a = a ^ b;
            
            // Step 3: Carry ko 'b' mein daal do agle iteration ke liye
            b = carry;
        }
        
        // Jab carry (b) 0 ho jayega, final answer 'a' mein hoga
        return a;
    }
}