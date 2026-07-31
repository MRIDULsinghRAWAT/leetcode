class Solution {
    public void sortColors(int[] nums) {
        // 3 pointer  - dutch national algom
        int l = 0;
        int r = nums.length - 1;
        int mid=0;
        while (mid <= r) {
            if (nums[mid] == 0) {
                int temp=nums[l];
               nums[l]=  nums[mid];  
                nums[mid]= temp;
                l++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
             int temp = nums[mid];
                nums[mid] = nums[r];
                nums[r] = temp;
                r--;
            }
        }
    }
}

/**0 mile toh: Left (l) wale se swap karo, aur l aur mid dono ko aage badha do.

1 mile toh: Kuch swap mat karo, bas mid ko ek step aage badha do.

2 mile toh: Right (r) wale se swap karo, aur sirf r ko peeche laao (mid wahin rahega). */
