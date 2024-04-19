import java.util.Scanner;

public class optimized_prime_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        boolean flag = true;
        // int b = sc.nextInt();
        for(int i=2; i*i <=a; i++){
            if(a%i ==0)
                flag = false;
        }
        System.out.println(flag);
    }
}
