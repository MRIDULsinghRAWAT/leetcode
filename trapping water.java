class Solution {
    public int trap(int[] height) {

 //iska logic clear clear saa lagra hai 
 // left - right ke between wala part is trapped 
 // aur trap - black part krra haii

int leftblock=0;

int rightblock=height.length-1; 
// n-1(last index jaise hota h)
int leftmax=0;
int rightmax=0;
int water=0;

while(leftblock < rightblock)  // 1<2
 {
 if(height[leftblock] < height[rightblock]){  // height 1< height 2
    if(height[leftblock] >=leftmax ){         // height 1 > 1 max
         leftmax = height[leftblock];        // 1 max =height 1
  
    }
    else{
water =water+leftmax-height[leftblock];    // hit and trial ( need to know this shit more )
    }
    leftblock ++; // aage bhada de

}else{

if(height[rightblock]>=rightmax){   // height 2>2max
    rightmax=height[rightblock];// 2max =height2
}else{
    water=water+rightmax-height[rightblock];   // trial
}
rightblock --;  // hit and trial tha same 
}
    }    
    return water ; 
    }
}
