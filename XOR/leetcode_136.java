package XOR;

public abstract class leetcode_136 {
     public int singleNumber(int[] nums) {
        int xor=0;
        for(int number :nums){
            xor=xor^number;
        }
        
    return xor;
    
    /**a ^ a = 0

a ^ 0 = a
 */
    }


}
