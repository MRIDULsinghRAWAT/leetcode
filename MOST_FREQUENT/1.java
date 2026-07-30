/**Question 1: Data Structures & Problem SolvingImagine you are building a log-monitoring feature
 *  for a backend system. You are given a stream of log IDs coming in as an unsorted array of integers,
 *  where most IDs appear twice, but two specific IDs appear only once, and all other unique IDs appear
 *  exactly twice.Write an efficient approach (or code) to find the two unique numbers that appear only 
 * once, with the following constraints:Time Complexity requirement: $\mathcal{O}(n)$Space Complexity 
 * requirement: $\mathcal{O}(1)$ (meaning you cannot use an extra hash map or set to count frequencies). */

// this means single number-III bhai 



class solution{ // hasp map is optimal 
  public int[] singleNumber(int[] nums) {
    
       int xor=0;
       for(int i=0;i<nums.length;i++){
        xor=xor^nums[i];
       }
     return xor;  
        }
    }
