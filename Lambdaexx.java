interface mysum{
	void sum(int a, int b);
}

class Lambdaexx{
	public static void main(String[] args){
		mysum obj = (int a, int b) -> {
			System.out.println(a+b);
		};
			obj.sum(5,4);
	}

}