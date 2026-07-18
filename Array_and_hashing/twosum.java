package Array_and_hashing;
import java.util.*;
public class TwoSum{
     HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int result = target - num[i];
            if (map.containsKey(result)) {
                return new int[] {
                        map.get(result), i
                };
            }
            map.put(num[i], i);
        }
        return new int[] {};
}
}
