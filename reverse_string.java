class Solution {
    public void reverseString(char[] s) {
        
        // string reverse ka logic dekh ab 
        //  2 pointer se 

        int left =0;
        int right =s.length-1;

        while(left<right){
            // swapping using 3rd variable
            char tempvariable = s[left];
            s[left]=s[right];
            s[right]=tempvariable;

            left ++;
            right--;

        }
    }
}