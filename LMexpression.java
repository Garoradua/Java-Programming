interface Parent{
	public void sum(int a,int b);
}
public class LMexpressionj{
	public static void main(String[] args){
		Parent obj = (a,b) -> {
			System.out.println(a+b);
		};
		obj.sum(5,6);
	}
}