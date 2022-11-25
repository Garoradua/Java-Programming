import java.util.*;
import java.util.Scanner;
class StackExample{ // 👈 renaming the class name as StackExample
    public static void main(String[] args) {
        int n = 12;
        Stack<String> stack = new Stack<>();
        System.out.println("Enter elements");
        while (n>0){
            stack.push(n%2);
            n= n/2;
        }
        String result = "";
        while (!stack.isEmpty()) //👈 Removing the semicolon here
            result += stack.pop();
        System.out.print(result);
    }
}