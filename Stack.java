import java.util.*;
class Stack{
	int arr[] = new int[5];
	int top=-1;
	void push(int value){
		if(top==5){
		System.out.println("Stack Overflow");	
		}else{
			top++;
			arr[top] = value;
		}
	}
	void pop(){
		if(top==-1){
		System.out.println("Stack underflow");	
		}else{
			System.out.println(arr[top]);
			top--;
		}
	}
	public static void main(String[] args){
		Stack d = new Stack();
		int value;
		int add=1;
				Scanner sc = new Scanner(System.in);
				do{
		System.out.println("Enter your choice 1.Push 2.Pop 3.Peek 4.Display");
		int choice = sc.nextInt();
		switch(choice){
		case 1: System.out.println("Enter the element you want to push");
				value = sc.nextInt();
				d.push(value); 
				break;
		case 2: d.pop(); 
				break;
		// case 3: d.peek(); 
		// 		break;
		// case 4: d.display();
		// 		 break;
		default: System.out.println("Enter correct choice");
		}
		System.out.println("add more ? 0/1");
		add = sc.nextInt();
	}while(add==1);
	}
}