import java.util.*;
public class Marks{
	public static void main(String args[]){
	System.out.println("Enter the marks of 5 subjects");
	Scanner sc = new Scanner(System.in);
	int marks1= sc.nextInt();
	int marks2= sc.nextInt();
	int marks3= sc.nextInt();
	int marks4= sc.nextInt();
	int marks5= sc.nextInt();
	int sum = marks1+marks2+marks3+marks4+marks5;
	System.out.println("Total sum is :" + sum);
	sum= sum*100;
	sum = sum/500;
	System.out.println(sum);
	System.out.println("Percentage is: " + sum + "%");
	}
}