import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        int count=0;
        do{
            n = n/10;
            count++;
            if(n==0)
                flag = false;
        }while(flag);

        System.out.println(count);
    }
}
