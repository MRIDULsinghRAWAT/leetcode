class Solution {
    public double myPow(double x, int n) {
// x^n        
if(n==0) return 1.0;  // base case 
  
long N=n;   // overflow handle krrne ke liye 
 if(N<0){
    x=1/x;
    N=-N; // reciprocal hua to N +ve ban jayega 
 }
 return helper(x, N);
    }

  private double helper(double x, long n) {  // long lio
    // divide and conquer use krrte hai 
   if (n == 0) return 1.0;

// n/2   // divide kia 
double half=helper(x,n/2);
    if(n%2==0){
        return half*half; // even case -> x^4 = (x^2)^2
    }
    else{
    return half*half* x; // odd case -> x^5 = (x^2)^2 * x
    }
}

    }



// // recursion   saare test cases  niii hore hai
// if (n==0){
//     return 1.0;  // base case 
// }
//    // overflow handle krrne ke liye 
// if(n<0){
//     return  1/ Math.pow(x,-n);   //  negative power ka case likhna hai ismei e
// }

// // recursive step yahan pe  
// //x^n = x * x^(n-1)
// return x*Math.pow(x,N-1);   // kuch bhi niii   formula bss

//     }
// }