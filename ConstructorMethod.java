interface Parent{
	public void fun1();
}
class Base{
	Base(){
		System.out.println("hello Base class");
	}
}
class ConstructorMethod{
	public static void main(String[] args){
		Parent obj = Base::new;
		obj.fun1();
	}
}