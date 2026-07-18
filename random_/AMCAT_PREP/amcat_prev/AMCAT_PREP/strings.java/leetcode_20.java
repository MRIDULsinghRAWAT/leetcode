public class leetcode_20 {
    public boolean isValid(String s) {
        while (true) { 
            if(s.contains("()")){
                s = s.replace("()","" );
            }
            else if(s.contains("[]")){
                s.replace("[]","");
;            }
            else if(s.contains("{}")){
                s.replace("{}","");
            }
            else{
                return s.isEmpty();
            }
        }
    }
}
            