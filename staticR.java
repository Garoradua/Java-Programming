interface Parent{
	public void func1();
}
class Base{
	public static void func2(){
		System.out.println("hello World");
	}
}
public class staticR{
	public static void main(String[] args){
		Parent obj = Base::func2;
		obj.func1();
	}
}