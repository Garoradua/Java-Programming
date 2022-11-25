interface Parent{
	public void func1();
}
class Base{
	Base(){
		System.out.println("hello");
	}
}
public class constructorR{
	public static void main(String[] args){
		Parent obj1 = Base::new;
		obj1.func1();
	}
}