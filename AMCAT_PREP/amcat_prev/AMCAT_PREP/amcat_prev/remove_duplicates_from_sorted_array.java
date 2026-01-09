package AMCAT_PREP.amcat_prev;

public class remove_duplicates_from_sorted_array {
    public static int removeDuplicates(int[] nums) {
        // logic: 2 pointer 
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                j++;
            }else{
                j++;
            }
        }
        return i+1;
    }
    // logic: 2 pointer
    //dry run
    // example: [1,1,2,2,3]
    // i=0, j=1
    // nums[0] != nums[1] -> i++, nums[1]=nums[2], j++
    // i=1, j=2
    // nums[1] != nums[2] -> i++, nums[2]=nums[3], j++
    // i=2, j=3
    // nums[2] == nums[3] -> j++
    // i=2, j=4
    // nums[2] != nums[4] -> i++, nums[3]=nums[4], j++
    // return i+1 = 4

}
