public class SUM_digits {
    public int sumDigits(int n)
{
    int sum=0;
    while(n>0){
        sum=sum+n/10;
        n=n%10;

    }
    return sum;


}    
public static void main(String[] args) {
        SUM_digits solver = new SUM_digits();
        int number = 1234; // You can change this to test different numbers
        int result = solver.sumDigits(number);
        System.out.println("The sum of digits is: " + result);
    }
}
