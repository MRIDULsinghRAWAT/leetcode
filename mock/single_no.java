class Solution {
    public int singleNumber(int[] nums) {

        // xor of same no.=0
        // xor of 0 =same no.
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
    /**Iteration 1 (i = 0):

Current number: nums[0] = 4
Operation: xor = 0 ^ 4
Result: xor = 4 (Kyunki 0 ^ X = X)

Iteration 2 (i = 1):

Current number: nums[1] = 1
Operation: xor = 4 ^ 1
Result: xor = 4 ^ 1 (Isi form mein samajhna aasan hai)

Iteration 3 (i = 2):
Current number: nums[2] = 2
Operation: xor = (4 ^ 1) ^ 2

Result: xor = 4 ^ 1 ^ 2
Iteration 4 (i = 3):
Current number: nums[3] = 1

Operation: xor = (4 ^ 1 ^ 2) ^ 1
Yahan magic hota hai! XOR order matter nahi karta, toh hum ise aise likh sakte
 hain: 4 ^ 2 ^ (1 ^ 1). Kyunki 1 ^ 1 = 0 hota hai, expression ban jayega 4 ^ 2 ^ 0, yani 4 ^ 2.
Result: xor = 4 ^ 2

Iteration 5 (i = 4):
Current number: nums[4] = 2
Operation: xor = (4 ^ 2) ^ 2
Ab yahan 2 ^ 2 = 0 ho jayega. Expression banega 4 ^ 0.

Result: xor = 4 */

