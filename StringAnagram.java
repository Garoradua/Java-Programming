import java.util.*;
public class StringAnagram {
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "siient";
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        str1 = new String(a1);
        str2 = new String(a2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));
    }
}
