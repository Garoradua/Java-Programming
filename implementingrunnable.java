class Thread1 implements Runnable{
	public void run(){
		while(true){
		System.out.println("Class 1111");
		}
	}
}
class Thread2 implements Runnable{
	public void run(){
		while(true){
		System.out.println("Class 2222");
		}
	}
}
public class implementingrunnable{
	public static void main(String[] args){
		Thread1 T1 = new Thread1();
		Thread2 T2 = new Thread2();

		Thread h1 = new Thread(T1);
		Thread h2 = new Thread(T2);

		h1.start();
		h2.start();
	}
}