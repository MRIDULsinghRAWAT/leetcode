public class logest_consecutive {
    
}
class Solution {
    public int longestConsecutive(int[] nums) {
      
      // learning hashmap
    
    
      /*LOGIC
      Ek HashMap<Integer, Integer> banate hain → key = number, value = us number ke sequence ki length.

Har number ke liye check karo:

Agar already map me hai to  skip (duplicates avoid karna).

Left neighbor (num - 1) aur right neighbor (num + 1) ka length dekho.
currLen = left + right + 1
maxLen = max(maxLen, currLen)

Update karo boundary values:

map.put(num, currLen)
map.put(num - left, currLen)
map.put(num + right, currLen)

*/
    HashMap<Integer,Integer> map = new HashMap<>();
   
    // for (int i = 0; i < nums.length; i++) {
    // int num = nums[i];   // manually pick the element 
    // System.out.println(num);

int maximumlength=0;
for(int num:nums){
if(!map.containsKey(num)){
int leftside =map.getOrDefault(num-1,0); 
//default value 0 hai ismei 
int rightside = map.getOrDefault(num+1,0);

//Agar key map me exist karti hai → uski value return karega.
//Agar key map me nahi hai → defaultValue return karega

int currentlength = leftside+rightside+1;
maximumlength = Math.max(maximumlength,currentlength);

map.put(num, currentlength);
map.put(num - leftside, currentlength);
map.put(num + rightside, currentlength);
    }
} 
return maximumlength;
  
      
      // hashing   
/* hash map 
unique key 
 
 creation of hash map 
 
         key     value
HashMap<String,Integer> map = new HashMap<>();
// insertion ========================
map.put("india",12345);
map.put("iia",10982345);
map.put("dia",345);

// search   / lookup==============
if(map.containsKey("dia")) 
                // return true hoga if exist warna false

// get ========================
map.get("china");



sopln(map);


iteration in hashmap
-> loop ka tareeka ismei :
 for(val: collection )


 e.g.  arr =  [1,2,3]
 for(int val: arr)

 or 

 for(Map.Entry<String,Integer>e : map.entrySet())
 sopln(e,getKey())
 sopln(e.getValue())
  */

  
    }
}