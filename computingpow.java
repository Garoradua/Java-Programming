import java.util.Scanner;

public class computingpow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(pow(x,n));
    }

    private static int pow(int x, int n) {
        if(n==0)
            return 1;
        int temp = pow(x, n/2);
        temp *= temp;
        if(n%2==0){
            return temp;
        }else{
            return temp*x;
        }
    }
}

2 ,2
2, 0
