
import java.util.Scanner;
public class composite {
    static boolean checkcomposite(int num)
    {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <=num/2; i++) { // iska alternate hai i*i <= num ysn fir math(sqrt(num))
            if(num % i == 0) {
                return true; 
            }
        }
        return false;
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if(checkcomposite(number)) {
            System.out.println(number + " is Composite");
        } else {
            System.out.println(number + " is Not Composite");
        }
        
        sc.close();
    }

    
}
