class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            int bit = n & 1;
            if (bit == 1)
                count++;
            n >>>= 1;
        }
        return count;
    }
}
/**
with bitwise 1&1=1 and 
0&0=0 

then right shift >>>
use this till the no. becomes 0
*/
