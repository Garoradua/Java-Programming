@FunctionalInterface
interface hello{
	public void fun();
}
public class FP{
	public static void main(String[] args){
		hello obj =() -> { System.out.println("Hello World");};
		obj.fun();
	}
}