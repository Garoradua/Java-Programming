class Thread1 extends Thread{
	public void run(){
		while(true){
			System.out.println("------------------------");
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		while(true){
			System.out.println("|||||||||||||||||||||||||||||||||||||||");
		}
	}
}
public class Mult{
	public static void main(String[] args){
		Thread1 T1 = new Thread1();
		Thread2 T2 = new Thread2();

		T1.start();
		T2.start();
	}
}