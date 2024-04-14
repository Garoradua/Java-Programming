import java.util.Scanner;

public class Optimized_euclidean_LCM {
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcdnumber = gcd(a,b);
        // a*b = gcd(a,b) * lcm(a,b);
        int lcmNumber = lcm(a,b,gcdnumber);
        System.out.println(lcmNumber);
    }
    private static int lcm(int a, int b, int gcdnumber) {
        return a*b/gcdnumber;
    }
}
