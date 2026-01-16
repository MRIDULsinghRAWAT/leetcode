class Solution {
    public void rotate(int[] nums, int k) {
        // reverse than swap 
        //Rotation = reverse entire array, then correct the order of the two parts
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1); // reverse entire array
        reverse(nums, 0, k - 1); // reverse first k elements
        reverse(nums, k, n - 1); // reverse the rest elements
    }
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
/**
Original  [1 2 3 4 5 6 7]
Reverse all  [7 6 5 4 3 2 1]
Reverse k   [5 6 7 4 3 2 1]    ------
Reverse rest [5 6 7 1 2 3 4]
 */
