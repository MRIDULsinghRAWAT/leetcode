import java.util.*;

class Solution {

    // 👉 YAHAN LIKHNA HAI: Aapko sirf yeh function complete karna hota hai
    public static int findMissingNumber(int[] arr, int n) {
        int xor = 0;

        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        for (int value : arr) {
            xor ^= value;
        }

        return xor;
    }


    // 👇 YEH BOILERPLATE HAI (Yeh non-editable ya hide kiya hua hota hai)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1]; 
        
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findMissingNumber(arr, n);
        System.out.println(result);
        
        sc.close();
    }
}