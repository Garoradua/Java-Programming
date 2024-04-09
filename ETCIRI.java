import java.util.*;
class Thread1 implements Runnable{
public void run(){
	while(true){
		System.out.println("|||||||||||||||||||||||||||||||");
	}
	}
}
class Thread2 implements Runnable{
	
	public void run(){
		while(true){
		System.out.println("------------------------");
	}
}
}

public class ETCIRI{
	public static void main(String[] args){
		Thread1 T1 = new Thread1();
		Thread2 T2 = new Thread2();
		Thread H1 = new Thread(T1);
		Thread H2 = new Thread(T2);
		H1.start();
		H2.start();
	}
}