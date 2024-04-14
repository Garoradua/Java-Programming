import java.util.Scanner;

public class Optimized_noOfTrailingZeros {
    public static int fact(int n){
        int res =(int) 1;
        for(int i=2; i<=n; i++)
            res = res*i;
        System.out.println(res);
        return res;
    }
    public static int trailingzero(int number){
        int sum =0;
        for(int i= 5;i<=number; i= i*5){
            sum += number/i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int factorial = fact(n);
        int trailingZeros = trailingzero(n);
        System.out.println(trailingZeros);
    }
}
