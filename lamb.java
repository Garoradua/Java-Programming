interface sumOfNumbers{
	void sum(int a, int b);
}
class lamb{
	public static void main(String[] args){
		sumOfNumbers obj = (int a, int b) -> {
			System.out.println(a+b);
		};

		obj.sum(6,7);
	}
}