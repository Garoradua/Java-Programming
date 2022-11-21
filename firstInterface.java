interface Gourav{
	public void hello();
}
class firstInterface implements Gourav{
	public void hello(){
		System.out.println("Hello World");
	}
	public static void main(String[] args){
		firstInterface divu = new firstInterface();
		divu.hello();
	}
}