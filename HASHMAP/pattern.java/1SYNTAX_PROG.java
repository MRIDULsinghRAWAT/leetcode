import java.util.*;

public class 1SYNTAX_PROG {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // 2. PUT (Insert values)
        map.put("Apple", 50);
        map.put("Mango", 30);
        map.put("Banana", 20);

        System.out.println("Initial Map: " + map);

        // 3. GET (Retrieve value)
        int mangoPrice = map.get("Mango");
        System.out.println("Price of Mango = " + mangoPrice);

        // 4. CHECK KEY EXISTS
        if (map.containsKey("Apple")) {
            System.out.println("Apple is present in map");
        }

        // 5. GET OR DEFAULT (safe access)
        int grapesPrice = map.getOrDefault("Grapes", -1);
        System.out.println("Price of Grapes = " + grapesPrice); // not present

        // 6. UPDATE VALUE (Frequency-like update)
        map.put("Apple", map.get("Apple") + 10);  // increased price
        System.out.println("Updated Apple Price = " + map.get("Apple"));

        // 7. REMOVE KEY
        map.remove("Banana");
        System.out.println("After removing Banana: " + map);

        // 8. HASHMAP OF LIST (Grouping Example)
        Map<String, List<String>> group = new HashMap<>();

        // group fruits by color
        group.putIfAbsent("Yellow", new ArrayList<>());
        group.get("Yellow").add("Mango");
        group.get("Yellow").add("Banana");

        group.putIfAbsent("Red", new ArrayList<>());
        group.get("Red").add("Apple");

        System.out.println("\nGrouped Fruits:");
        System.out.println(group);

        // 9. ITERATE THROUGH MAP
        System.out.println("\nIterating Key-Value Pairs:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
