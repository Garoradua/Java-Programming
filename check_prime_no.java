import java.util.Scanner;

public class check_prime_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean checkPrime = true;;
        for(int i=2; i<=n/2; i++){
            if(n%i ==0){
                checkPrime = false;
                break;
            }
        }
        System.out.println(checkPrime);
    }
}
