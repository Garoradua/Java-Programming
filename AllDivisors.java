 import java.util.Scanner;

public class AllDivisors {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=1; i<=n/2; i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //     }
        // }
        // System.out.println(n);
        // int x;
        //     for(int i=1; i*i<=n; i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //         x=n/i;
        //         if(x!= i)
        //         System.out.println(x);
        //     }
        // }
        int i;
            for(i=1; i*i<n; i++){
                if(n%i==0)
                    System.out.println(i);
            }
            for(int j=i; j>=1; j--){
                if(n%j==0)
                    System.out.println(n/j);
            }

    }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for(int i=1; i<=n; i++){
    //         if(n%i==0){
    //             System.out.println(i);
    //         }
    //     }
    // }
}
