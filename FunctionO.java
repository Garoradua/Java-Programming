class Parent{
	public void run(){
		System.out.print("Hello");
	}
}
class Child extends Parent{
	public void run(){
		System.out.print("Hello Child");
	}
}
public class FunctionO{
	public static void main(String[] args){
		Parent c1 = new Child();
		c1.run();
	}
}