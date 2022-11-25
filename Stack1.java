import java.util.*;
class Stack1{
	public static void main(String[] args){
		Stack<String>Name=new Stack<String>();
		Name.addFirst("Hello");
		Name.addFirst("Hi");

		for(String str : Name){
			System.out.println(str);
		}		
		Name.pop();
					System.out.println(Name);


	}
}