class Thread1 extends Thread{
	public void run(){
		while(true){
		System.out.println("Class 11111");
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		while(true){
		System.out.println("Class 2222");
		}
	}
}
public class extendingThread{
	public static void main(String[] args){
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2();

		obj1.start();
		obj2.start();
	}
}