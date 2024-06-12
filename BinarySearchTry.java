import java.util.*;
import java.util.Collections;
public class BinarySearchTry {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(200);
        arr.add(50);
        arr.add(100);
        int size = arr.size();
        Collections.sort(arr);
        int result = binarySearch(arr, 20 , 0 , size-1);
        System.out.println(result);
    }
    public static int binarySearch(ArrayList<Integer> list, int x, int first, int last){
    // int size = list.size();
    if(last<first) return -1;
    int mid = (first+last)/2;
    if(list.get(mid)==x) return mid;
    if(list.get(mid) > x)
        return binarySearch(list, x, first, mid-1);
    else
        return binarySearch(list, x, mid+1, last);
    }
}
