/**Q. Create a HashMap of 3 fruits and their prices.
Then do the following tasks:

Print the price of Apple

Increase the price of Mango by 10

Check if Banana is available

Print the final updated map */
import java.util.HashMap;
public class basics_q3{
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put(" apple",120);
        map.put(" mango",190);
        System.out.println("price of apple"+map.get("apple"));
        map.put("mango",map.get("mango")+10);
        System.out.println("final map="+map);
    

        
    }
}