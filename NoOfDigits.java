import java.util.Scanner;

public class NoOfDigits {

    public static int totalDigits(int n){
        boolean flag = true;
        int count=0;
        do{
            n = n/10;
            count++;
            if(n==0)
                flag = false;
        }while(flag);

        return count;
    }
    public static void main(String[] args){
        //ny using function
        Scanner sc = new Scanner(System.in);
        boolean more = true;
        while(more){
        int n = sc.nextInt();
        int count;
        count = totalDigits(n);
        System.out.println(count);
        System.out.println("more numbers ?");
        more = sc.nextBoolean();
        }
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
