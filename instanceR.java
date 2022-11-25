interface Parent{
	public void func1();
}
class Base{
	public void func2(){
		System.out.println("hello");
	}
}
public class instanceR{
	public static void main(String[] args){
		Base obj = new Base();
		Parent obj1 = obj::func2;
		obj1.func1();
	}
}