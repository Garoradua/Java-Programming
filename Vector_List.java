import java.util.*;
public class Vector_List {
    public static void main(String[] args){
        List<Integer> list = new Vector<Integer>();
        list.add(1);list.add(2);
        Iterator itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
