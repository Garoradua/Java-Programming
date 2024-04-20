import java.util.Scanner;

public class findAllPrimeNo {
    public static boolean ifPrime(int n){
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5; i*i<=n; i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            boolean flag = ifPrime(i);
            if(flag==true){
                System.out.println(i);
            }
        }
    }
}
