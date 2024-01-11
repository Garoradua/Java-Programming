// interface One{
// 	public void fun1();
// }
// class Two{
// 	public static void fun2(){
// 		System.out.println("Fun Method");
// 	}
// }
// class MethodReference1{
// 	public static void main(String[] args){
// 		One obj = Two::fun2;
// 		obj.fun1(); 
// 	}
// }

// interface One{
// 	public void fun1();
// }
// class two{
// 	public void fun2(){
// 		System.out.println("Fun method");
// 	}
// }
// class MethodReference1{
// 	public static void main(String[] args){
// 		two obj = new two();
// 		One obj1 = obj::fun2;
// 		obj1.fun1();
// 	}
// }

interface One{ 
	public void fun1();
}
class Two{
	Two(){
		System.out.println("Fun method");
	}
}
class MethodReference1{
	public static void main(String[] args){
		One obj = Two::new;
		obj.fun1();
	}
}