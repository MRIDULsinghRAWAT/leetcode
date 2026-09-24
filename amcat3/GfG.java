import java.util.Arrays;

public class GfG {
    public static int missingNum(int[] arr) {
          int n = arr.length;
        int xor = n; // to include last no. in xor calculation
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i] ^ i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int res = missingNum(arr);
        System.out.println(res);
    }
}