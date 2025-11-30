import java.util.HashMap;
public class basics_q2 {
    /**
     * 
Print the population of India
Check if China exists in the map
Remove SA from the map
Print the updated map
     */
    public static void main(String[] args){
    HashMap<String, Integer> map = new HashMap<>();
map.put("india",3131);
map.put("Sa",313131);

System.out.println("population of india"+ map.get("india"));
System.out.println("population of china present ?"+ map.containsKey("china"));
map.remove("Sa");
System.out.println("updated map:"+ map);

    }

}

