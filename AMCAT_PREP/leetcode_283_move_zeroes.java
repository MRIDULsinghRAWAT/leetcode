package AMCAT_PREP;

public class leetcode_283_move_zeroes {
    public void moveZeroes(int[] nums) {
        // swapping tech use krrdete h zero occur ni  hua to swap  front pe 
        // instead of bringing zeros to end put non zero to start !

        int nonzero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonzero];
                nums[nonzero] = temp;
                nonzero++;

            }
        }

    }
}

}
