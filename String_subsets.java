import java.util.*;
public class String_subsets {
    public static void main(String args[]){
        String str = "ABC";
        List<List<Character>> result = new ArrayList<>();
        backtracking(str, 0, result, new ArrayList<Character>());
        System.out.println(result);
    }

    private static void backtracking(String str, int start, List<List<Character>> result, List<Character> temp) {
        result.add(new ArrayList<>(temp));
        for(int i=start; i<str.length(); i++){
            temp.add(str.charAt(i));
            backtracking(str, i+1, result, temp);
            temp.remove(temp.size()-1);
        }
    }
}
