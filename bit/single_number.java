class Solution {
    public int singleNumber(int[] nums) {

        // xor of same no.=0
        // xor of 0 =same no.
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = nums[i] ^ result;
        }
        return result;
    }
}