// class Parent extends Thread{
// 	public void run(){
// 		while(true){
// 		System.out.println("111111111");
// 	}
// }
// }
// class Base extends Thread{
// 	public void run(){
// 		while(true){
// 		System.out.println("222222222");
// 	}
// }
// }
// public class ImplementingThread{
// 	public static void main(String[] args){
// 		Parent obj1 = new Parent();
// 		Base obj2 = new Base();
// 		obj1.start();
// 		obj2.start();
// 	}
// }
class Parent implements Runnable{
	public void run(){
		while(true){
		System.out.println("111111111");
	}
}
}
class Base implements Runnable{
	public void run(){
		while(true){
		System.out.println("222222222");
	}
}
}
public class ImplementingThread{
	public static void main(String[] args){
		Parent obj1 = new Parent();
		Base obj2 = new Base();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
