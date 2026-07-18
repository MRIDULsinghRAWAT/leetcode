package Array_and_hashing;
import java.util.*;

public class twosum { 
    
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
        twosum ts = new twosum();
        int[] nums = {2, 7, 11, 15};
        int[] result = ts.twoSum(nums, 9);
        System.out.println(Arrays.toString(result)); // Output: [0, 1]
    }
}
/**1. Two Sum (Search & Return)
Yahan hum ek hi baar map ka use karte hain dhoondhne ke liye:

Pehle check karo: Kya target - current_number map mein hai? (map.containsKey)

Agar mil gaya: Index wapas nikaalo (map.get).

Agar nahi mila: Tabhi map.put karo taaki aage ke liye save ho jaye. */