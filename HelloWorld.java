// occurence of each character in a string
import java.util.*;
public class HelloWorld{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String original = sc.nextLine();
		int arr[] = new int[26];
		int length = original.length();
		for(int i=0; i<length; i++){
			int x = original.charAt(i)-97;
			arr[x]++;
		}
		for(int i=0; i<26; i++){
			if(arr[i]!=0){
				System.out.println("Occurence of char "+ (char)(i+97) + " is " + arr[i]);
			}		}
	}
}