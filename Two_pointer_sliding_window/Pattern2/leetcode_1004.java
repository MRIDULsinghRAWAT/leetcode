public class leetcode_1004 {
    public int longestOnes(int[] nums, int k) {
int left = 0, sum = 0, res = 0;
int maxlength=0;
for (int right = 0; right < nums.length; right++) {
    sum += nums[right];
    while (sum > k) {
        sum -= nums[left];
        left++;
    }
    res = Math.max(res, right - left + 1);
}

return res;
}
}