package Two_pointer_sliding_window.Pattern1;

public class leetcode_643 {

    
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        long maximum=Long.MIN_VALUE;
        long sum=0;
for(int i=0;i<nums.length;i++){
    sum=sum+nums[i];
    if(i-left+1==k){
        maximum=Math.max(maximum,sum);
        sum=sum-nums[left];
        left++;
    }
}
    return ((double)maximum/k);
    }

}