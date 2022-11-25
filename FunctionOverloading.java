class myClass{
	public void run(){
		System.out.println("Normal class");
	}
	public void run(int a){
		System.out.println("Normal class"+a);
	}
	public void run(String hi){
		System.out.println("Normal class"+hi);
	}

}
public class FunctionOverloading{
	public static void main(String[] args){
		myClass a = new myClass();
		a.run();
		a.run(5);
		a.run("Hello");
	}
}