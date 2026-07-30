class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int max = 0;
        for (int r = 0; r < nums.length; r++) {
            while (nums[r] - nums[l] > 1) {
                l++;
            }
            if (nums[r] - nums[l] == 1) {
                max = Math.max(max, r - l + 1); //r-l+1 standar thing used in 2pointer  sliding window prob.
            }
        }
        return max;

    }
}class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int max = 0;
        for (int r = 0; r < nums.length; r++) {
            while (nums[r] - nums[l] > 1) {
                l++;
            }
            if (nums[r] - nums[l] == 1) {
                max = Math.max(max, r - l + 1); //r-l+1 standar thing used in 2pointer  sliding window prob.
            }
        }
        return max;

    }
}