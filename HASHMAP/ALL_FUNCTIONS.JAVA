import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        // HashMap banaya rollNo -> Marks
        HashMap<Integer, Integer> marksMap = new HashMap<>();

        // 1. put(key, value) → data insert
        marksMap.put(101, 85);
        marksMap.put(102, 90);
        marksMap.put(103, 78);
        System.out.println("Initial Data: " + marksMap);  
        // {101=85, 102=90, 103=78}

        // 2. get(key) → specific student ka marks
        System.out.println("Marks of Roll 102: " + marksMap.get(102));  
        // 90

        // 3. containsKey() → check karo student exist karta hai ya nahi
        System.out.println("Is Roll 104 present? " + marksMap.containsKey(104));  
        // false

        // 4. replace(key, newValue) → marks update karo
        marksMap.replace(103, 80);
        System.out.println("After updating Roll 103: " + marksMap);  
        // {101=85, 102=90, 103=80}

        // 5. remove(key) → ek student hata do
        marksMap.remove(101);
        System.out.println("After removing Roll 101: " + marksMap);  
        // {102=90, 103=80}

        // 6. getOrDefault(key, defaultValue) → agar key nahi hai to default show karo
        System.out.println("Marks of Roll 105: " + marksMap.getOrDefault(105, -1));  
        // -1 (not found)

        // 7. size() → kitne students hai
        System.out.println("Total Students: " + marksMap.size());  
        // 2

        // 8. keySet(), values(), entrySet() → sab data iterate karna
        System.out.println("All Roll Numbers: " + marksMap.keySet());  
        // [102, 103]

        System.out.println("All Marks: " + marksMap.values());  
        // [90, 80]

        System.out.println("Complete Data:");
        for (Map.Entry<Integer, Integer> entry : marksMap.entrySet()) {
            System.out.println("Roll " + entry.getKey() + " → Marks: " + entry.getValue());
        }
    }
}
