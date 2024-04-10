import java.util.*;
public class recursion_fibonacci{
    static int fibonaci(int n){
        if(n<=1){
            return n;
        }

        return fibonaci(n-2) + fibonaci(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // fibonaci(n, first, second, x);
        for(int i=0; i<n; i++) {
            System.out.println(fibonaci(i) + " ");
        }
        
    }
}