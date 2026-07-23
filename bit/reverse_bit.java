class Solution {
    public int reverseBits(int n) {
        // here integer ka seen h jo 32 bit ka hota h 
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1; // finding last bit 
            result = result << 1 | bit; //add last bit 
            n >>>= 1; // imp shift for next bit 
        }
        return result;

    }
}
