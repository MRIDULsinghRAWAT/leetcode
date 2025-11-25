public class leetcode_29 {
    
    public int divide(int dividend, int divisor) {
if(dividend ==divisor) return 1;

// overflow prevention 
if(dividend ==Integer.MIN_VALUE && divisor ==-1) return Integer.MAX_VALUE;
if(divisor==1) return dividend;







    // int sum=0;
    // int count=0;
    // while(sum+divisor <=dividend){
    //     count=count+1;
    //     sum=sum+divisor;

    // }
    // return count ;
    
        // dividend =22
        //divisor =3
        // 3+3+3+3+3+3+3   till 7 
        // result =7
        // 22/3=7.__
    }
}
