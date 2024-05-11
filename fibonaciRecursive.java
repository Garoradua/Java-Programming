import java.util.Scanner;

public class fibonaciRecursive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(fibonaciseriesprint(i));
        }
    }

    public static int fibonaciseriesprint(int n){
    if(n<=1) return n;
        return fibonaciseriesprint(n-1) + fibonaciseriesprint(n-2);
    }
      
}
