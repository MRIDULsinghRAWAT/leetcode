package AMCAT_PREP.amcat_prev;

public class max_subarray {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(currentsum,max+nums[i]);
            max=Math.max(max,currentsum);
        }

    return max;
    }

}
