import java.util.Scanner;
public class sumofNNaturalnumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //time complexity - c - constant
        System.out.println(n*(n+1)/2);

        // time complexity - n
        // int sum=0;
        // for(int i=1; i<=n; i++){
        //     sum += i;
        // }
        // System.out.println(sum);
    }
}