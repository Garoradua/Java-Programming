import java.util.ArrayList;
import java.util.List;

public class subsequenceString {

    public static void findSubsequence(String str, int start, List<List<Character>> result, List<Character> temp){
        
        result.add(new ArrayList<>(temp));
        for(int i=start; i<str.length(); i++){
            temp.add(str.charAt(i));
            findSubsequence(str, i+1, result, temp);
            temp.remove(temp.size()-1);
        }
        
    }
    public static void main(String[] args){
        String str = "ABC";
        List<List<Character>> result = new ArrayList<>();
        findSubsequence(str , 0, result, new ArrayList<>());
        System.out.println(result);
    }
}
