import java.util.PriorityQueue;
public class kth_largest {
    public int findKthLargest(int[] nums, int k) {
       // using min heap or priority queue

PriorityQueue<Integer> pq =new PriorityQueue<>();
for(int n:nums){
    pq.add(n);    // yahan se element add hua 
    if(pq.size()>k)    // if size> k
    pq.poll();    // remove smallelst element
}
return pq.peek(); //heap ka top = kth largest element





// kth yahan pe mtlb kii ,,, list mei k=2 - mtlb 2nd largest nikal - example 


// bubble sort --------------------------------
/**

 */

// for(int i=0;i<nums.length-1;i++){
// for(int j=0;j<nums.length-i-1;j++){
//     if(nums[j]<nums[j+1]){ // decending ke liye 

// // swap
// int temp =nums[j];   // 3rd variable ke throgh  swapping
// nums[j]=nums[j+1];
// nums[j+1]=temp;

//     }
// }
// }
// return nums[k-1];
// bhaiiiiiiii time li mit exceededddddd



// OR  -----------------
//  Arrays.sort(nums);
//  return nums[nums.length-k];      // k=2, length =5 ,, 5-2=3

        
    }
} 
