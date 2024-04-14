import java.util.Scanner;

public class Euclidean_gcd {

    public static int gcd(int a, int b){
        while(a!=b){
            if(b>a) b=b-a;
            else a=a-b;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( gcd(a,b));
    }
}
