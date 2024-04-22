import java.util.Scanner;
import java.util.Stack;
public class stackjava {
    static int top =-1;
    static void pushElement(int arr[], int n, int size){
        if(top == size-1){
            System.out.println("stack overflow");
        }else{
            arr.push(n);
        }
    }
    public static void main(String[] args){
        int n =5;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        int t;
        t = sc.nextInt();
        pushElement(arr, t, n);
    }
}
