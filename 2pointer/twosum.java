package 2pointer;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int currentsum = numbers[l] + numbers[r];
            if (currentsum == target) {
                return new int[] { l + 1, r + 1 }; // index from 1 
            } else if (currentsum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[] {};

    }
}
