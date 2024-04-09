@FunctionalInterface
interface Parent{
	public void fun1();
}
class Base{
	Base(){
		System.out.println("Reference to a Constructor");
	}
}

public class methodR{
	public static void main(String[] args){
		Parent obj1 = Base::new;
		obj1.fun1();
	}
}
