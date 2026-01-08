package AMCAT_PREP.amcat_prev;


public class 4 {
    // check armstrong number
    //121 
    //true 
    public static void main(String[] args) {
        // my logic 
        // numbers seperate karo -> then cube karo-> = to original num 
        // armstrong 
        int num=153;
        int original=num;
        int sum=0;
        while(num>0){
            int digit =nums%10;// last digit
            sum=sum+digit*digit*digit; // cube hua and add kia 
            num=num/10; // last digit remove 
        }
        if(sum==original){
            System.out.println(original+" is an armstrong number");
        }else{
            System.out.println(original+" is not an armstrong number");
    }

}

    
}
