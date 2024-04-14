import java.util.Scanner;

public class PallindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orgNumber = n;
        int x=0;
        int new_no =0;
        
        while(n>0){
        x = n%10;
        new_no = new_no*10 + x;
        n = n/10;
        }
        if(orgNumber == new_no)
            System.out.println("Pallindrome Number");
        else
            System.out.println("Not a Pallindrome Number");
    }
}
