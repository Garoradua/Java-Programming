// interface One{
// 	public void fun1();
// }
// class Two{
// 	public static void fun2(){
// 		System.out.println("Fun Method");
// 	}
// }
// class RSIC{
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
// 		System.out.println("Fun Method");
// 	}
// }
// class RSIC{
// 	public static void main(String[] args){
// 		Two obj = new Two();
// 		One obj1 = obj::fun2;

// 		obj1.fun1();

// 	}
// }

interface One{
	public void fun1();
}

class Two{
	Two(){
		System.out.println("Fun Method");
	}
}

class RSIC{
	public static void main(String[] args){
		One obj = Two::new;
		obj.fun1();r
	}
}