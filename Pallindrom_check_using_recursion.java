import java.util.Scanner;

public class Pallindrom_check_using_recursion {
    public static boolean checkPallidrome(String str, int start, int end){
        // System.out.println("start "+start);
        // System.out.println("End "+end);
        if(start>=end){
            // System.out.println("True");
            return true;
        }
        // if(str.charAt(start) != str.charAt(end)){
        //     // System.out.println("False");
        //     return false;
        // }
        return (str.charAt(start) != str.charAt(end) && checkPallidrome(str, start+1, end-1 ));
        // return true;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        System.out.println(checkPallidrome(str, 0, len-1 ));
    }
}
