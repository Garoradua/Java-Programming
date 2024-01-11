interface Expression{
	void print(int a, int b);
}
public class Lambdae{
	public static void main(String[] args){
		Expression obj = (int a, int b) ->{
			System.out.println(a+b);
		};
	}
}