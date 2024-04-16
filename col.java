import java.util.*;
import java.util.Stack;
public class col{
    public static void main(String[] args){
        Stack<String> st = new Stack<String>();
        Iterator itr = st.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
