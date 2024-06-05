import java.util.HashMap;
import java.util.Map;

public class workingOfHashMap{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Hello",123);
        map.put("hi",456);

        System.out.println(map.get("Hello"));
        System.out.println(map.get("abc"));

        //using keyset
        for(String str : map.keySet()){
            System.out.println(map.get(str));
        }

        //using entryset
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}