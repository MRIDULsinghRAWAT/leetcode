package Array_and_hashing;
import java.util.*;

public class ContainsDuplicate {
    public static boolean contains_duplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) { //// else add the new no.
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        
        System.out.println("Test 1 (Expected true): " + contains_duplicate(test1));
        System.out.println("Test 2 (Expected false): " + contains_duplicate(test2));
    }
}