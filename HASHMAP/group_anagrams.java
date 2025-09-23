class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
// anagram -> "eat", "tea"
// not anagram ->  "rat" aur "car  ( no same letters)   

// LEARNING --------------

// logic 
// agar 2 words ka sorted version same hai to anagram     

HashMap<String, List<String>> map = new HashMap<>();
// filling 
for(String s:strs){  //
char[] chars = s.toCharArray();   // "eat" → ['e','a','t']    aisa conversion 
Arrays.sort(chars);           //a,e,t  
String key = new String(chars);    // eat =aet    or  tea =aet

//fallback ka seen dekh ismei 
map.putIfAbsent(key,new ArrayList<>());   // koi bhi pheli baar ayega to EMPTY list banayi h
map.get(key).add(s);  // sorted key mei add   -> "eat" → key "aet" → list me add → ["eat"]

}

// sort
List<Map.Entry<String,List<String>>> list= new ArrayList<>(map.entrySet());
list.sort(Map.Entry.comparingByKey());

// sirf values extract krrte hai ab 
List<List<String>> result = new ArrayList<>();
for(Map.Entry<String,List<String>> entry:list){
Collections.sort(entry.getValue());        // sort each group inside
result.add(entry.getValue());
        }
return result;


    }
}