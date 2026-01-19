package 1_PATTERN_WISE_DSA.1_Two_pointer;

public class leetcode_283 {
    public static void main(int[] nums) {
        // how to find we can use 2 pointer in this ?
        // same array modify hora h 
        // isis;liye
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                nums[left]=nums[right]; 
                left++;
            }
        }
while(left<nums.length){
    nums[left]=0;
    left++;
}

        
        
        
    }
}
