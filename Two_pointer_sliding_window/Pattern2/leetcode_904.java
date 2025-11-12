public class leetcode_904 {
public int totalFruit(int[] fruits) {
    if(fruits.length==0) return 0;
    // will use a condition here to check if we have more than 2 types of fruits in the same basket
    int left=0;
    int max=0;
    int count[]=new int[10001];
    int unique=0;
    for(int i=0;i<fruits.length;i++){
        if(count[fruits[i]]==0){ 
            unique++;
        }
        count[fruits[i]]++;
        
        while(unique>2){  // condition 
            count[fruits[left]]--;
            if(count[fruits[left]]==0){
                unique--;
            }
            left++;
        }
        max=Math.max(max,i-left+1);
   }
    return max;
    
    }
}    

/**
 * https://leetcode.com/problems/fruit-into-baskets/
 */

/**Took me damn long to understand the problem. 
 * example = [1,2,1,2,3]= ismei bss 2 hi alag alag fruits h so hum 1,2,1,2 tk lenge
 * 
 * Basically it's just: "Find the longest continuous 
 * sub array
 *  that has exactly 2 distinct elements." */