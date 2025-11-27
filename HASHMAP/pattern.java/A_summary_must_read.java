1. getOrDefault (Frequency Count)
map.put(x, map.getOrDefault(x, 0) + 1);

//Most used pattern in entire LeetCode
// Used in anagrams, sliding window, hashing, frequency questions


2. Check Key Exists
map.containsKey(x);

//Used in Two Sum, duplicates, string problems



3. Insert / Put
map.put(key, value);

//Core operation everywhere



4. Get Value
int v = map.get(key);

// Needed in all lookup-based problems


5. HashMap for Index Storing
map.put(num, index);

// Main idea for Two Sum, Subarray problems, prefix sum logic
\

6. HashMap of Lists (Grouping)
map.putIfAbsent(key, new ArrayList<>());
map.get(key).add(value);


//Used in Group Anagrams
// Used in Graph adjacency lists



7. Remove / Decrease Value
map.put(x, map.get(x) - 1);
if (map.get(x) == 0) map.remove(x);


//Used in sliding window (minimum window substring, substring problems)