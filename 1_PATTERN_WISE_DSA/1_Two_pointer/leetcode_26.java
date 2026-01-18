package 1_PATTERN_WISE_DSA.1_Two_pointer;

public class leetcode_26 {
public int removeDuplicates(int[]nums){
    // this is sorted-> we have recognized that we can use 2 pointer
      int i=0; // slow pointer
    for(int j=1;j<nums.length;j++){ // fast pointer
        if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
        }
    }
    return i+1;
}
}
