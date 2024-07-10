import java.util.*;
public class occurenceofEachcharacterusinghashmap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();

        for(char c : charArray){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map.containsKey('g'));

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
