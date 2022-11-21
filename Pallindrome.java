import java.util.*;
class Pallindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int original = number;
		int temp;
		int i=0;
		int duplicate=0;

		while(number%10!=0){
			temp = number%10; //4
			number = number/10;
			duplicate = duplicate*10 + temp; // 4
		}
		System.out.println(original);
		System.out.println(duplicate);
		if(original==duplicate){
			System.out.println("Pallindrome number");
		}else{
			System.out.println("not Pallindrome number");
		}

	}
}