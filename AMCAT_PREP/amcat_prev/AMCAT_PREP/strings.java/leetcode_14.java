class leetcode_14 {
    public String longestCommonPrefix(String[] strs){
        // logic:
        // edge case
        if(strs.length==0 || strs==null) return "";
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1); //means of this line is reduce the prefix by 1 from the end
                if(prefix.isEmpty()) return "";
            }

        }
        // if array length is 0 return ""
        // take first string as prefix
        // loop through the array from index 1
        // while prefix is not matching with current string
        // reduce the prefix by 1 from the end
        // if prefix becomes empty return ""
        // finally return prefix
        return prefix;

    }
    
}
/** question
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
 */