package AMCAT_PREP;

public class reverse_string {
    public static void main(String[] args) {
String str="abcd";
String rev="";   // otherwise nulldcba output hoga
for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
}
        System.out.println(rev);

    

}
    }
    

