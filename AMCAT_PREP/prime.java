package AMCAT_PREP;

class prime {
    public boolean prime (int num){
        if(num<=1)return false;
            for(int i=2;i<=num;i++){
            if(num%i==0 && i!=num){
                return false;
            }
            }
        
        return true;
    }
    
}
