// syntax 
HashMap<Integer, Integer> count = new HashMap<>();
count.put(fruits[i], count.getOrDefault(fruits[i], 0) + 1); // add fruit to the basket - this is the hashmap syntax
// getOrDefault(key, defaultValue) - returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
// Example:
HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 2);
int count = map.getOrDefault("apple", 0); // returns 2
int count2 = map.getOrDefault("banana", 0); // returns 0 since "banana" is not in the map


// put(key, value) - associates the specified value with the specified key in this map.
// Example:
map.put("banana", 3); // now "banana" is associated with 3
int count3 = map.get("banana"); // returns 3


// remove(key) - removes the mapping for a key from this map if it is present.
// Example:
map.remove("apple"); // removes the entry for "apple"
int count4 = map.get("apple"); // returns null since "apple" has been removed


// size() - returns the number of key-value mappings in this map.
// Example:
int size = map.size(); // returns the number of entries in the map
// containsKey(key) - returns true if this map contains a mapping for the specified key.
// Example:
boolean hasBanana = map.containsKey("banana"); // returns true
boolean hasApple = map.containsKey("apple"); // returns false


// isEmpty() - returns true if this map contains no key-value mappings.
// Example:
boolean empty = map.isEmpty(); // returns false if there are entries in the map


// clear() - removes all of the mappings from this map.
// Example:
map.clear(); // now the map is empty
int newSize = map.size(); // returns 0


// keySet() - returns a Set view of the keys contained in this map.
// Example:
Set<String> keys = map.keySet(); // returns a set of all keys in the map


// values() - returns a Collection view of the values contained in this map.
// Example:
Collection<Integer> values = map.values(); // returns a collection of all values in the map


// entrySet() - returns a Set view of the mappings contained in this map.
// Example:
Set<Map.Entry<String, Integer>> entries = map.entrySet(); // returns a set of all key-value pairs in the map


// Example usage in context of the fruit basket problem:
if (fruits == null || fruits.length == 0) return 0;
        int left = 0;
        int max = 0;
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < fruits.length; i++) {
            count.put(fruits[i], count.getOrDefault(fruits[i], 0) + 1); // add fruit to the basket - this is the hashmap syntax 

            while (count.size() > 2) { // condition 
                int c = count.get(fruits[left]) - 1; 
                if (c == 0) count.remove(fruits[left]); // iska meaning hai ki agar count 0 ho gya to us fruit ko hata do
                else count.put(fruits[left], c); 
                left++;
            }

            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}