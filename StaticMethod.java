interface Parent{
	public void fun1();
}
class Base{
	public static void fun2(){
		System.out.println("Hello Base Class");
	}
}
class StaticMethod{
	public static void main(String[] args){
		Parent obj = Base::fun2;
		obj.fun1();
	}
}