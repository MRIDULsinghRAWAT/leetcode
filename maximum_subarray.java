class Solution {
    public int maxSubArray(int[] nums) {
        // int []   tab ----initialize nums[0]
int maxSum =nums[0];
int currentSum =nums[0];

//KADANE APPROACH 
/**
explaination 

1> Start with the first element as current sum and max sum.

2> For each new element, decide → start fresh from this element OR continue with previous sum.

3> Update the max sum at every step.

4> At the end, max sum is the largest subarray sum. 

 */

 // 0 pe already current aur max ko likha hai so , 1 se shuru kia 
for(int i=1;i<nums.length;i++){
    // yahan 2 choices hai ya to nums[i], ya fir currentsum+nums[i]  - jo bada hoga wo ayega  ( tbahi math.max ka func laga hai )
    currentSum =Math.max(nums[i],currentSum +nums[i]);
    maxSum =Math.max(maxSum,currentSum);  // yahan pe check hoga ki current max ahmare maxsum se bada hai ki niii agar bada hai to update krrdia 
}

return maxSum;  // last mei max sum return 
    }
}