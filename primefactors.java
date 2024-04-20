import java.util.Scanner;

public class primefactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = checkprime(n);
        int i=2;
        if(prime==true)
            System.out.println("prime factors are "+ n);
        else{
            do{
                if(n%i==0){
                    System.out.println(i + " ");
                    n = n/i;
                }else   i++;
            }while(n!=1);
        }
    }

    private static boolean checkprime(int n) {
        if(n==1)
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i=5; i*i<=n; i+=6){
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}
