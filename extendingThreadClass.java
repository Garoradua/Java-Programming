import java.util.*;
class MyThread1 extends Thread{

	public void run(){
			while(true){
		System.out.println("THREAD 1");
	}
}
}
class MyThread2 extends Thread{
	
	public void run(){
		while(true){
		System.out.println("2");
	}
}
}

class extendingThreadClass{
	public static void main(String[] args){
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();

		t1.start();
		t2.start();
	}
}