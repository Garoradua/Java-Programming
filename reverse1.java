import java.util.*;
class reverse1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		int len = str.length();
		String strrev = "";
		for(int i=len-1; i>=0; i--){
			strrev += str.charAt(i);
		}
		System.out.print(strrev);
		// int arr[] = new int[5];
		// for(int i=0; i<5; i++){
		// 	arr[i] = sc.nextInt();
		// }
		// for(int i=0; i<5-1; i++){
		// 	for(int j=0; j<5-1-i; j++){
		// 		if(arr[j]>arr[j+1]){
		// 			int temp = arr[j];
		// 			arr[j] = arr[j+1];
		// 			arr[j+1] = temp;
		// 		}
		// 	}
		// }
		// for(int i=0; i<=5/2; i++){
		// 	int temp = arr[i];
		// 	arr[i] = arr[5-1-i];
		// 	arr[5-1-i] = temp;
		// }
		// for(int i=0; i<len; i++){
		// 	System.out.print(" "+str[i]);
		// }

	}
}