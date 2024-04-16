import java.util.*;
public class Linked_List {
    public static void main(String[] args){
        List<String> list = new LinkedList<String>();
        list.add("gourav");
        list.add("divya");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
