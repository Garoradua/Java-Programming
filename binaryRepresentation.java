import java.util.Scanner;

public class binaryRepresentation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        while(n > 0){
        if(n%2 == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
        n = n/2;
    }
    }
}
