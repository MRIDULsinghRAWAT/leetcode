class Solution {
    public int largestElement(int[] nums) {
        int l=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>l) l=nums[i];
        }
        return l;
    }
}