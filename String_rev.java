import java.util.*;
public class String_rev{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		char ch;
		for(int i=0; i<len/2; i++){
			ch = str.charAt(i);
			 str.charAt(len-1-i);
			// str.charAt(str[len-1-i]) = ch;
		}
			System.out.println(str);
	}
}