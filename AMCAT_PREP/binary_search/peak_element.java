package AMCAT_PREP.binary_search;

public class peak_element {
    public int findPeakElement(int[] nums) {
        int peak=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[peak]){
                peak=i;
        }
    }
        return peak;

    }
    
}
