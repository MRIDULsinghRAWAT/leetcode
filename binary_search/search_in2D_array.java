class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length;
        int colms = matrix[0].length;
        int l = 0;
        int r = (rows * colms) - 1; // this is the total elmet here
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int midvalue = matrix[mid / colms][mid % colms]; // for row & colm
            if (midvalue == target) {
                return true;
            } else if (midvalue > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}