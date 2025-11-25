public class leetcode_29 {
    
    public int divide(int dividend, int divisor) {
    int sum=0;
    int count=0;
    while(sum+divisor <=dividend){
        count=count+1;
        sum=sum+divisor;

    }
    return count ;
    
        // dividend =22
        //divisor =3
        // 3+3+3+3+3+3+3   till 7 
        // result =7
        // 22/3=7.__
    }
}
