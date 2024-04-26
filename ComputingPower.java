import java.util.Scanner;

public class ComputingPower{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int result = computePow(x,n);
        System.out.println(result);
    }

    private static int computePow(int x, int n) {
       if(n==0){
        return 1;
       }
       int pow = x;
       for(int i=2; i<=n; i++){
            pow = pow*x;
       }
       return pow;
    }
}