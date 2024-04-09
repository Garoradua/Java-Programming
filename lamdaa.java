@FunctionalInterface
interface sum{
	void add(int a, int b);
}
public class lamdaa{
	public static void main(String[] args){
		sum s = (a,b) ->{
			System.out.println(a+b);
		};
		s.add(5,2);
	}
}