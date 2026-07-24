class Solution {
    public boolean canJump(int[] nums) {
        int maxreach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxreach) { //base case - if the number woulb be bigger then of no use
                return false;
            }
            maxreach = Math.max(maxreach, i + nums[i]); // i add coz index strt from 0
            if (maxreach >= nums.length - 1)
                return true;
        }
        return true;
    }
}
/**Logic & Approach:
 * Max Reach Track Karo:Hum ek variable banate hain (maan lo maxReach ya furthest), jo ye batata hai ki hum 
 array mein maximum kis index tak pahunch sakte hain. Shuru mein ye 0 par hota hai.

 * Array Traverse Karo:Hum index $0$ se shuru karke aage badhte hain. Har index i par check karte hain:
 Kya current index i, hamari maxReach se bada hai?Agar i > maxReach ho gaya, iska matlab hum is index tak 
 kabhi pahunch hi nahi sakte. Yahin se loop todkar false return kar dena chahiye.
 
 Max Reach Update Karo:Agar hum current index par hain aur wo reachable hai, toh hum check karte hain ki 
 yahan se hum kitna aage ja sakte hain: i + nums[i].Hum maxReach ko update
  karte hain:$$maxReach = \max(maxReach, i + nums[i])$$
  
  Condition Check:Loop ke chalte chalte agar maxReach 
  last index ($\text{nums.length} - 1$) ya usse aage nikal jaye, toh iska matlab hum aaram se end tak pahunch 
  sakte hain, aur hum true return kar dete hain. */