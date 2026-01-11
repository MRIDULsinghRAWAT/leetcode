package AMCAT_PREP.amcat_prev.final_prep_array.java;

public class missing number {
    public int missingNumber(int[] nums) {
        // logic:
        // using sum formula
        // n(n+1)/2
        // calculate expected sum
        // calculate actual sum
        // return expected - actual
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        return expectedSum - actualSum;
}
}

// diffrence btw for(int num:nums) and for(int i=0;i<nums.length;i++){
// enhanced for loop and normal for loop
// enhanced for loop is used to iterate through each element directly
// normal for loop is used when index is needed or more control over iteration is required