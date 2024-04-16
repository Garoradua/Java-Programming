import java.util.*;
import java.util.Stack;
public class stacklist {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0; i<=5; i++){
            st.push(i);
        }
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);

        for(int i=0; i<st.size(); i++)
        System.out.println(st.get(i));

        Iterator itr = st.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next());
        }
        System.out.println(st.pop());
        itr = st.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
