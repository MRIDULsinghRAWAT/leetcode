public class Pattern_1_fixed_window_size {
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = 0, sum = 0, maxSum = 0;
        
        for (right = 0; right < n; right++) {
            sum += arr[right];
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[left];
                left++;
            }
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSumSubarray(arr, k));
    }
}