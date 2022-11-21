class Base1{
	public void fun1(){
		System.out.println("Base class 1 executed");
	}
}
class Base2 extends Base1{
	public void fun2(){
		System.out.println("Base class 2 executed");
	}
}

public class MultiLevel extends Base2{
	public static void main(String[] args){
		MultiLevel d = new MultiLevel();
		d.fun1();
		d.fun2();
	}
}