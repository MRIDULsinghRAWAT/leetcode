package 1_PATTERN_WISE_DSA.1_Two_pointer;

public class leetcode_26 {
   public int removeDuplicates(int[]nums){
    // this is sorted-> we have recognized that we can use 2 pointer
    
    //[1,1,2,4]
    int left=0;
    int right=nums.length-1;
    while(left<right){
        if(nums[left]==nums[left+1]){ 
            right--;
        }
        else{
            left++;
        } 
   } 
    return left+1; // length of unique elements
    }

