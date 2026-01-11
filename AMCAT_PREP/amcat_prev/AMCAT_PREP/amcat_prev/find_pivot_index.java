package AMCAT_PREP.amcat_prev.AMCAT_PREP.amcat_prev;

public class find_pivot_index {
    public int pivotIndex(int[] nums) {
        // logic to find pivot index
        // using prefix sums
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
    }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            if(leftsum==totalsum-leftsum-nums[i]){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;


    
}
