import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int smallNumber;
        if(a>b) smallNumber=b;
        else smallNumber=b;
        int gcd=-1;
        for(int i=1; i<=smallNumber; i++){
            if(a%i ==0 && b%i ==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
