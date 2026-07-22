/**Setup: xor ko n se start karte hain kyunki 0 se n tak ki range hai.
 * Logic: Array ke elements aur unke indices ko aapas mein XOR karte hain (a^a = 0) 
 * property se duplicate elements cancel ho jate hain).
 * Result: Sabhi pairs cancel hone ke baad sirf missing number bach jata hai. */
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xor = n;
        for (int i = 0; i < n; i++) {
            xor = nums[i] ^ xor ^ i;
        }
        return xor;
    }
}
