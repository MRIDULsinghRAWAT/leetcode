class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
        while (p2 >= 0) {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }

    }
}

/**We place pointers p1 and p2 at the end of the actual numbers in both arrays.

A third pointer, p3, sits at the very end of the empty space in nums1.

We compare the numbers at p1 and p2 to see which is larger.

The larger number is placed at the back of nums1 at position p3.

We then move p3 and the winning pointer one step to the left.

Working backwards ensures we don't accidentally overwrite unmerged numbers in nums1.

Finally, any leftover numbers in nums2 are simply copied into the front of nums1! */