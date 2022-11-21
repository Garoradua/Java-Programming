import java.util.*;
class Thread1 implements Runnable{
	public void run(){
		while(true){
		System.out.println("Thread 1");
	}
	}
}
class Thread2 implements Runnable{
	public void run(){
		while(true){
		System.out.println("2");
	}
	}
}
class ImplementRunnable{
	public static void main(String[] args){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		Thread h1 = new Thread(t1);
		Thread h2 = new Thread(t2);

		h1.start();
		h2.start();
	}
}