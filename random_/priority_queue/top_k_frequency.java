import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class top_k_frequency {
 public int[] topKFrequent(int[] nums, int k) {
        //using priority queue
        //similar to kth largest find :

        // frequency ke liye map ka use (count krrne ke liye)
        Map<Integer,Integer> freq =new HashMap<>();
        for(int n:nums)
        freq.put(n,freq.getOrDefault(n,0)+1);

PriorityQueue<Integer> pq =new PriorityQueue<>((a,b)->freq.get(a)-freq.get(b));
 //seekhho kii yeh cheez min heap banati ->>> jo ki freq ke bais pe sort krrti h 
 
 
 for (int n : freq.keySet()) {
            pq.add(n);
            if (pq.size() > k)
             pq.poll();         //hata dia lst freq
        }
        
        int[]result =new int[k];
        for(int i=k-1;i>=0;i--) 
        //ye line heap ke bache hue elements ko reverse order mein result array mein daalti hai (taaki output sahi aaye).
        result[i]=pq.poll();
                return result;



    }
}
