import java.util.*;
class StringPallindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		String strrev = "";
		for(int i=len-1; i>=0; i--){
			strrev += str.charAt(i);
		}
		System.out.println(strrev);
		System.out.println(str);
		if(strrev.equals(str)){
			System.out.println("Pallindrome number");
		}else{
			System.out.println("not Pallindrome number");
		}

	}
}