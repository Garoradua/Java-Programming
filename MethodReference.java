// interface One{
// 	 void function1();
// }
// class Two{
// 	public static void function2(){
// 		System.out.println("Hello World");
// 	}
// }
// public class MethodReference{
// 	public static void main(String[] args){
// 		One obj = Two::function2;
// 		obj.function1();
// 	}
// }
// interface One{
// 	 void function1();
// }
// class Two{
// 	void function2(){
// 		System.out.println("Hello World");
// 	}
// }
// public class MethodReference{
// 	public static void main(String[] args){
// 		Two secondObj = new Two();
// 		One obj = secondObj::function2;
// 		obj.function1();
// 	}
// }

interface One{
	 void function1(String msg);
}
class Two{
	Two(String msg){
		System.out.println("Hello World");
	}
}
public class MethodReference{
	public static void main(String[] args){
		One obj = Two::new;
		obj.function1("Hello");
	}
}