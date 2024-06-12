import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WorkingwithArrays {
 
    
    public static void main(String[] args){
        Integer[] arr = {11,5,6,120,8,9};
        for(int i : arr){
            System.out.print(i + " ");
        }
        // Arrays.sort(arr);
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
        // for(int i : list){
        //     System.out.print(i + " ");
     


    }

    @Override
    public String toString() {
        return "WorkingwithArrays []";
    }
}
