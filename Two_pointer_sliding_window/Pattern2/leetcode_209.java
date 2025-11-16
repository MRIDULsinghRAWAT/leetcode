public class leetcode_209 {
     public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];

            while(sum>=target){ // update the  minimum before shrinking 
                minimum=Math.min(minimum,i-left+1); // this finds logest subarray & we need shortest one 

                sum=sum-nums[left]; 
                left++;
           
           
            }
        }
return minimum==Integer.MAX_VALUE?0:minimum;
// this  handles the edge case 

    }
}
/*
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 */