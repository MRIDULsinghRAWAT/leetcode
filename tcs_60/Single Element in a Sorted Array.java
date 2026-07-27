class Solution {
    public int singleNonDuplicate(int[] nums) {
        //O(log n)
        /**Pattern: Single element se pehle saare pairs hamesha (even, odd) index par hote hain, 
         * aur uske aate hi pattern tut kar (odd, even) ho jata hai.

Search: Hum binary search (mid ^ 1) se yahi check karte hain—agar pattern intact hai toh iska matlab
 single element aage (right) hai, warna peeche (left) hai. */
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == nums[mid ^ 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }
}
//         //o(n)
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1); // store freq
//         }
//         for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//             if (entry.getValue() == 1) {
//                 return entry.getKey();
//             }
//         }

//         return -1;
//     }
// }