import java.util.Scanner;

public class prime {
    static boolean checkprime(int num)
    {
        if(num <= 1) {
            return false;
        }
       // for(int i = 2; i <=num/2; i++) { // iska alternate hai i*i <= num
    for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0) {
                return false; 
            }
        }
        return true;
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if(checkprime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
        
        sc.close();
    }
    
}
