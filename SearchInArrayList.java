import java.util.ArrayList;

public class SearchInArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(200);
        arr.add(50);
        arr.add(100);

        int size = arr.size();
        for(int i=0; i<size; i++){
            if(arr.get(i)==9){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
