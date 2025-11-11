import java.util.HashMap;
public class leetcode_2461 {
	public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        long maximum=Long.MIN_VALUE;
        long sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(sum ==k){
                Math.max(sum,maximum);
                sum=sum-nums[left];
                left++;
            }else{
                sum=sum+nums[i];
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                left++;
            }
        }
        return maximum;
        
        
                /**map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
Meaning:
map is a HashMap<Integer, Integer> that stores each number and how many times it has appeared in your current window.

map.getOrDefault(nums[i], 0) →
-check if nums[i] already exists in the map;
-> if yes, return its count; if not, return 0.

Then you add +1 → meaning you’ve now seen this number one more time.

Finally, map.put(nums[i], …) updates the map with the new count. */
            

                
            }
        }







    
