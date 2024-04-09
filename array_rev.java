import java.util.*;
public class array_rev{
	public static void main(String[] args){
		System.out.println("Enter the size of array :");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n/2; i++){
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
	}
}