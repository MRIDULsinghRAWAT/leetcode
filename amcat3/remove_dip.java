import java.util.HashSet;

class GfG {

    static int removeDuplicates(int[] arr) {
        int unique = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[unique] = arr[i];
                unique++;
            }
        }
        return unique; 
      
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}