public class leetcode_643 {
    
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        long maximum = Long.MIN_VALUE;
        long sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            
            
            if (i - left + 1 == k) {
                maximum = Math.max(maximum, sum);
                sum = sum - nums[left];
                left++;
            }
        }
        return ((double) maximum / k);
    }

    public static void main(String[] args) {
        leetcode_643 solution = new leetcode_643();
        
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        
        double result = solution.findMaxAverage(nums, k);
        System.out.println("Maximum Average is: " + result);
    }
}
/**
 * https://leetcode.com/problems/maximum-average-subarray-i/
 */