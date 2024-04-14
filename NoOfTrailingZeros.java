import java.util.Scanner;

public class NoOfTrailingZeros {

    public static long fact(Long n){
        Long res =(long) 1;
        for(int i=2; i<=n; i++)
            res = res*i;
        return res;
    }
    public static int trailingzero(Long number){
        int zeros =0;
        while(number%10 ==0 ){
            zeros++;
        number = number/10;
        }
        return zeros;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long factorial = fact(n);
        int trailingZeros = trailingzero(factorial);
        System.out.println(trailingZeros);
    }
}
