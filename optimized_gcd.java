import java.util.Scanner;
public class optimized_gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int minNumber = Math.min(a, b);

        while(minNumber>0){
            if(a%minNumber ==0 && b%minNumber==0){
                break;
            }
            minNumber--;
        }
        System.out.println(minNumber);
    }
}
