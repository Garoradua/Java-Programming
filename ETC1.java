// class Mythread1 extends Thread{
// 	public void run(){
// 		while(true)
// 		System.out.println("1111111111");
// 	}
// }
// class Mythread2 extends Thread{
// 	public void run(){
// 		while(true)
// 		System.out.println("********");
// 	}
// }
// public class ETC{
// 	public static void main(String[] args){
// 		Mythread1 t1 = new Mythread1();
// 		Mythread2 t2 = new Mythread2();

// 		t1.start();
// 		t2.start();
// 	}
// }


class Mythread1 implements Runnable{
	public void run(){
		while(true){
			System.out.println("****");
		}
	}
}
class Mythread2 implements Runnable{
	public void run(){
		while(true){
			System.out.println("-------------------");
		}
	}
}
public class ETC1{
	public static void main(String[] args){
		Mythread1 t1 = new Mythread1();
		Mythread2 t2 = new Mythread2();

		Thread h1 = new Thread(t1);
		Thread h2 = new Thread(t2);

		h1.start();
		h2.start();
	}
}