import java.util.HashMap;
public class basics_q{
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();

        // adding the data
        map.put("Mridul",31);
        map.put("don",314);

//print
System.out.println("student"+ map.keySet());
System.out.println("codes"+ map.keySet());
System.out.println("data of don"+ map.get("don"));

    }
}
