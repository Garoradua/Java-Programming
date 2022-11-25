@FunctionalInterface
interface sumOfValues{
	public void sum(int a, int b);
}
class Lambda{
	public static void main(String[] args){
		
		sumOfValues obj = (int a, int b) -> {
			System.out.println(a+b);
		};

		obj.sum(5,6);

	}
}