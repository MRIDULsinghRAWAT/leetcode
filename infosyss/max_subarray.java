class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int max = nums[0];
        int currentsum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentsum = currentsum + nums[i];
            currentsum = Math.max(currentsum, nums[i]);
            max = Math.max(currentsum, max);

        }
        return max;
    }
}
