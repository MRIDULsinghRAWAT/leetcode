package AMCAT_PREP.strings.java;

public class reverse {
    public void reverseString(char[] s) {
        // logic:
        // swap first and last character till middle

        int left = 0;
        int right = s.length - 1;
        while (left < right) {

            // swapping
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++; 
            right--;
        }
    }
}
/*
dry run:
Input: s = ["h","e","l","l","o"]
left = 0, right = 4
swap s[0] and s[4] -> s = ["o","e","l","l","h"]
left = 1, right = 3
swap s[1] and s[3] -> s = ["o","l","l","e","h"]
left = 2, right = 2
loop ends
Output: ["o","l","l","e","h"]
 */



//     public static void main(String[] args) {
// String str="abcd";
// String rev="";  
// for(int i=0;i<str.length();i++){
//     rev=str.charAt(i)+rev;
// }      
//         System.out.println(rev);

    
// }
