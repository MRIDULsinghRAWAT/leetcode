package 1_PATTERN_WISE_DSA.1_Two_pointer;

public class basic_syntax {
    // 2 pointer syntax
    public void twoPointerExample(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Example operation: swap elements at left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
