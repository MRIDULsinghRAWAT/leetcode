class Solution {
    public int maxArea(int[] height) {
        // 2 pointer
        int l = 0;
        int r = height.length - 1;
        int maxwater = 0;
        while (l < r) {
            int currentHeight = Math.min(height[l], height[r]); // smallest line - jo ki area hoga paani ka
            int difference = r - l; // width
            int currentwater = currentHeight * difference;
            maxwater = Math.max(currentwater, maxwater);

            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxwater;
    }
}
