//extending thread class

// class Thread1 extends Thread{
// 	public void run(){
// 		while(true){
// 			System.out.println("------------------------");
// 		}
// 	}
// }
// class Thread2 extends Thread{
// 	public void run(){
// 		while(true){
// 			System.out.println("|||||||||||||||||||||||||||||||||||||||");
// 		}
// 	}
// }
// public class Multithreading{
// 	public static void main(String[] args){
// 		Thread1 T1 = new Thread1();
// 		Thread2 T2 = new Thread2();

// 		T1.start();
// 		T2.start();
// 	}
// }


// implementing runnable interface

class Thread1 implements Runnable{
	public void run(){
		while(true){
			System.out.println("-----------------------------------");
		}
	}
}

class Thread2 implements Runnable{
	public void run(){
		while(true){
			System.out.println("||||||||||||||||||||||||||||||||||||||");
		}
	}
}

public class Multithreading{
	public static void main(String[] args){
		Thread1 T1 = new Thread1();
		Thread2 T2 = new Thread2();

		Thread H1 = new Thread(T1);
		Thread H2 = new Thread(T2);

		H1.start();
		H2.start();
	}
}