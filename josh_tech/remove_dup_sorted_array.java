class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[unique] = nums[i];
                unique++;
            }
        }
        return unique;
    }
}
/**Sirf naya (unique) number milne par hi usko array ke front mein shift karke pointer badhao, 
 * baaki saare continuous duplicates ko bas ignore (skip) karte jao. */