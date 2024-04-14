import java.util.Scanner;

public class NoOfDigits {

    public static int totalDigits(int n){
        int count=0;

        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        //ny using function
        Scanner sc = new Scanner(System.in);
        boolean more = true;
        int n = sc.nextInt();
        int count;
        count = totalDigits(n);
        System.out.println(count);
        //Normal approach
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean flag = true;
        // int count=0;
        // do{
        //     n = n/10;
        //     count++;
        //     if(n==0)
        //         flag = false;
        // }while(flag);

        // System.out.println(count);
    }
}
