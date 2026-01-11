package AMCAT_PREP.binary_search;

public class find_elemnt_int_sorted_array {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            return -1;
        }
    }
    
