class Thread1 extends Thread{
	public void run(){
		while(true)
		System.out.println("*********************");
	}
}
class Thread2 extends Thread{
	public void run(){
		while(true)
		System.out.println("()()()()()()()");
	}
}

public class Thread11{
	public static void main(String[] args){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}