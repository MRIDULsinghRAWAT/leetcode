package AMCAT_PREP.amcat_prev;

public class leetcode_268 {
    public int missingNumber(int[] nums) {
        // my logic 
        // sort the array
            java.util.Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            
        // check for each index if index != nums[index]
        }
        }
         return nums.length; // because if all no. are present from 
         // 0 to n-1 then n is missing 
        // return index
        // else return nums.length
    }
}
