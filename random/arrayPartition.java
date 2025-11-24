package random;
class Solution {
    public int arrayPairSum(int[] nums) {
        
    /**
         -> pair kia 
         -> dono pair ka min imum nikala 
         -> fir unka (min elements ka)sum krr dia  */
         
Arrays.sort(nums);
int sum=0;

// ab pair 
// iska logic dekh  {1,2,3,4,} sort hai 1+3=4 krrna hai mtlb alternate 

for(int i=0;i<nums.length;i=i+2) { 
    // i=0 -> 0+2=2   -> iss case mei 2nd index 
sum= sum + nums[i];  // 1+3(2nd index jo hai )= 4
}
return sum;
    }
}