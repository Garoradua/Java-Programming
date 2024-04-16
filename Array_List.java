
import java.util.*;
public class Array_List{
    public static void main(String[] args){

        List<Integer> list = new ArrayList<Integer>();

        for(int i=1; i<=5; i++){
            list.add(i);
        }

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    //     List<String> list = new ArrayList<String>();
    //     list.add("Gourav");
    //     list.add("Shivay");

    //     Iterator<String> itr = list.iterator();

        
    //     while(itr.hasNext()){
    //         System.out.println(itr.next());
    //     }
    }
}