// interface Parent{
// public void func1();
// }
// class Child{
// 	public static void func2(){
// 		System.out.println("Hello Function 2");
// 	}
// }
// public class staticmethodreference{
// 	public static void main(String[] args){
// 		Parent obj = Child::func2;
// 		// obj.func1();
// 	}
// }
// interface One{
// 	public void func1();
// }
// class Two{
// 	public void func2(){
// 		System.out.println("Hello");
// 	}
// }
// class staticmethodreference{
// 	public static void main(String[] args){
// 		Two obj1 = new Two();
// 		One obj2 = obj1::func2;
// 		obj2.func1();
// 	}
// }
interface One{
	public void func1();
}
class Two{
	Two(){
		System.out.println("Hello");
	}
}
class staticmethodreference{
	public static void main(String[] args){
		// Two obj1 = new Two();
		One obj2 = Two::new;
		obj2.func1();
	}
}