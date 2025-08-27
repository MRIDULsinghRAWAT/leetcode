class Solution {
    public int strStr(String haystack, String needle) {
    

    int a = haystack.length();
    int b = needle.length();

    for(int i =0;i<=a-b;i++){

        // funct   substring lena[i,i+n] jaiusa kuch 
        if(haystack.substring(i,i+b).equals(needle)){
            return i;
        }
    }
    return -1;
    }
}