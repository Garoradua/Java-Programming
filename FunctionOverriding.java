import java.util.*;
interface Parent{
	public void run();
}
interface Mother{
	public void run();
}
class Base implements Parent , Mother{
	public void run(){
		System.out.println("Hello Sister");
	}
}
class FunctionOverriding{
	public static void main(String[] args){
		Mother b1 = new Base();
		b1.run();
	}
}