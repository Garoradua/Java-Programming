import java.util.*;
public class Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int i3;
		int i1=0, i2=1;
		for(int i=0; i<total; i++){
			if(i==0)
				System.out.print(i1 +" ");
			else if(i==1)
				System.out.print(i2 + " ");
			else{
				i3 = i1+i2;
				System.out.print(i3 + " ");
				i1 = i2;
				i2 = i3;
			}


	}
}
}