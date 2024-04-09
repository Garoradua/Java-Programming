abstract class M1{
abstract void show();
}
class M2 extends M1{
void show(){
	System.out.println("Hello");
}
}
public class Abstract{
	public static void main(String[] args){
		M1 m = new M2();
		m.show();
	}
}