interface Parent{
	public void func();
}
public class lambdaExpression{
	public static void main(String[] args){
		Parent obj = () -> {
			System.out.println("Hello");
		};
		obj.func();
	}
}