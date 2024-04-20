import java.util.Scanner;

public class optimized_SeiveOfEratosthenes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] booleanArray = new boolean[n+1];
        for(int i=0; i<=n; i++){
            booleanArray[i] = true;
        }
        for(int i=2; i<n; i++){
            if(booleanArray[i]){
                    System.out.println(i);
                for(int j=i*i; j<=n; j+=i){
                    booleanArray[j] = false;
                }
            }
        }
    }
}
