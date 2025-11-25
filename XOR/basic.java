public class basic {
    public static void main(String[] args) {
        int a=5;//0101
        int b=3;//0011
        int result=a^b;
        System.out.println(result);
        
    }
}
/**If bits are same → 0

If bits are different → 1 

  0101   (5)
^ 0011   (3)
--------
  0110   (6)
*/
