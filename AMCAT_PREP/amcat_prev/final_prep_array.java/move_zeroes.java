package AMCAT_PREP.amcat_prev.final_prep_array.java;

public class move_zeroes {
    public void moveZeroes(int[] nums) {
        // logic to move zeroes to end
    int nonzero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                // swapping
                int temp=nums[i];
                nums[i]=nums[nonzero];
                nums[nonzero]=temp;
                nonzero++;
// logic
// instead of bringing zeroes to end bring non zeroes to start
// swapping tech
// if non zero occur krta h to swap krdo front pe
// increment krdo nonzero pointer
// finally all non zeroes will be at start and zeroes at end
//
            }
        }
    }
}