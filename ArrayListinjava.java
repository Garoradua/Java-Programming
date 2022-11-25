import java.util.*;
class ArrayListinjava{
	public static void main(String[] args){
		ArrayList<Integer> Name = new ArrayList<Integer>();
		Name.add(1);
		Name.add(3);
		Name.add(0,4);
		Name.remove(0);
		System.out.println(Name.get(1));


		System.out.println(Name);
	}
}