import java.util.Scanner;

public class fibonaciseries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        fibonaciseriesprint(n);
        
    }

    private static void fibonaciseriesprint(int n) {
        int first = 0;
        int second  = 1;
        int sum ;
       for(int i=1; i<=n; i++){
        if(i==1) System.out.println(first);
        else if(i==2) System.out.println(second);
        else{
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }
       }
    }
}