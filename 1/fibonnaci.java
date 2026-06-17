//package 1;

public class fibonnaci {
    public static void main(String[]args){
        int n=5;
        int a=0;
        int b=1;
        System.out.print(a+""+b+"");
        for(int i=0;i<n-2;i++){
            int c=a+b;
            System.out.print(c+"");
            a=b;
            b=c;
        }
    }
}
/*fib(0)=0
fib(1)=1;
fib(n)=fib(n-1)+fib(n-2) 
*/

