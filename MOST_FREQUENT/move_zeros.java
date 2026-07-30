class Solution {
    public void moveZeroes(int[] nums) {
        int notzero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[notzero];
                nums[notzero]=temp;
                notzero++;
            }
        }
    }
}



/**  for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    int x = nums[i];
                    nums[i] = nums[j];
                    nums[j] = x;
                }
            }
        } */