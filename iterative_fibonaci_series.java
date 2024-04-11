import java.util.*;
public class iterative_fibonaci_series{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp, first = 0, second = 1;
        for(int i=0; i<n; i++){
            if(i<=1){
                System.out.print(i + " ");
            }else{
                temp = second;
                second = first + second;
                first = temp;
                System.out.print(second + " ");
            }
        }
    }
}