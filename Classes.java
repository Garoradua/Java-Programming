interface Car1{
	public void fun();
}
class Car2{
	public void fun(){
		System.out.println("haha fun");
	}
}
class Classes extends Car2 implements Car1{
	public static void main(String[] args){
		Classes obj = new Classes();
		obj.fun();
	}
}