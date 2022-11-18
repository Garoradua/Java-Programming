import java.util.Scanner;
public class StringReverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str;
		String strrev = "";
		str = sc.nextLine();
		char temp;
		int length = str.length();
		for(int i=length-1; i>=0; i--){
			strrev+=str.charAt(i);
		}
		System.out.println(strrev);
	}
}