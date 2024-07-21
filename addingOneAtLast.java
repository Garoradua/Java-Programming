import java.util.*;
public class addingOneAtLast{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(9);
        int n = list.size()-1;
        int i;
        for(i=n; i>=0; i--){
            if(list.get(i)==9){
                list.set(i,0);
            }else{
                list.set(i, list.get(i)+1);
                break;
            }
        }
        if(i==-1){
            list.set(0,1);
            list.add(n+1, 0);
        }
        System.out.println(list);
    }
}