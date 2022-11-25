@FunctionalInterface
interface myClass{
	public void func();
}
public class Lamda{
	public static void main(String[] args){
		myClass m1 = () -> {System.out.println("Hello World");};
		m1.func();
	}
}