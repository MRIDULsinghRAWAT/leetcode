package Array_and_hashing;
import java.util.*;

public class TwoSum { 
    
    public int[] twoSum(int[] num, int target) { 
    HashMap<Integer, Integer> map = new HashMap<>(); 
    for (int i = 0; i < num.length; i++) { 
        
        // 'result' wo number hai jo humein chahiye, taaki target pura ho jaye.
        int result = target - num[i]; 
        
        // Check karo kya 'result' pehle se hamare map mein mil chuka hai?
        if (map.containsKey(result)) { 
            // Agar mil gaya, toh purana index aur abhi wala index (i) return kar do.
            return new int[] { map.get(result), i }; 
        }
        
        // Agar nahi mila, toh current number aur uska index map mein save kar lo,
        // taaki baad mein aane wale numbers ise check kar sakein.
        map.put(num[i], i); 
    }
    
    // Agar loop khatam hone tak koi pair nahi mila, toh khali array return karo.
    return new int[] {}; 
}
    
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int[] result = ts.twoSum(nums, 9);
        System.out.println(Arrays.toString(result)); // Output: [0, 1]
    }
}