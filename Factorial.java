import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        int result =1;
        if(n==0 || n==1)
            return 1;
        
        for(int i=2 ; i<=n; i++){
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);
    }
}
