import java.util.*;
public class leetcode_1343{
    public int numOfSubarrays(int[] arr, int k, int threshold) {
    int left=0;
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        if(i-left+1==k){
            sum=sum+arr[i];
            if(sum)
        }
    }
    

    }
    
}