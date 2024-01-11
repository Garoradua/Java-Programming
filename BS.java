import java.util.Scanner;
class BS{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int temp;
		for(int i=0; i<size; i++){
			for(int j=0; j<size-1-i; j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
	}
}