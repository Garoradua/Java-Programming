
import java.util.*;
public class Array_List{
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Gourav");
        list.add("Shivay");

        Iterator<String> itr = list.iterator();

        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}