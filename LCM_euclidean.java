import java.util.Scanner;
public class LCM_euclidean{
    public static int gcdOfNumber(int a, int b){
        if(b==0)
            return a;

        return gcdOfNumber(b, a%b);
    }
    public static int lcmOfNumber(int a, int b, int gcd){
        return (a*b)/gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd =  gcdOfNumber(a,b);
        System.out.println(lcmOfNumber(a,b,gcd));
    }
}