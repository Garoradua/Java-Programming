import java.sql.SQLOutput;
import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args){
        String str;
        String strrev = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int n = str.length();
        char ch;
        for(int i=n-1; i>=0; i--){
            strrev += str.charAt(i);
        }
        System.out.println(strrev);
    }
}
