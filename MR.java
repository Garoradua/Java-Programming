// interface One{
// 	public void fun1();
// }
// class Two{
// 	public static void fun2(){
// 		System.out.println("Hello World");
// 	}
// }
// public class MR{
// 	public static void main(String[] args){
// 		One obj = Two::fun2;
// 		obj.fun1();
// 	}
// }

// interface One{
// 	public void fun1();
// }
// class Two{
// 	public void fun2(){
// 		System.out.println("Hello World");
// 	}
// }
// public class MR{
// 	public static void main(String[] args){
// 		// One obj = Two::fun2;
// 		// obj.fun1();

// 		Two obj1 = new Two();
// 		One obj2 = obj1::fun2;

// 		obj2.fun1();
// 	}
// }
interface One{
	public void fun1();
}
class Two{
	Two(){
		System.out.println("Hello World");
	}
}
public class MR{
	public static void main(String[] args){
		// One obj = Two::fun2;
		// obj.fun1();

		One obj = Two::new;

		obj.fun1();
	}
}