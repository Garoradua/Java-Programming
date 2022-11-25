interface Parent{
	public void fun1();
}
class Base{
	public void fun2(){
		System.out.println("Hello Base class");
	}
}
class InstanceMethod{
	public static void main(String[] args){
		Base obj1 = new Base();
		Parent obj2 = obj1::fun2;
		obj2.fun1();
	}
}