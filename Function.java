 public class Function{
	static void staticFunction(){
		System.out.println("Hello Static");
	}

	void nonStaticFunction(){
		System.out.println("Non Static");
	}
	public static void main(String args[]){
		staticFunction();
		Function obj = new Function();
		obj.nonStaticFunction();
	}
}