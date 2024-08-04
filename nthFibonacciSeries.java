public class nthFibonacciSeries {
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        int n = 4;
        int x = fibonacci(4);
        System.out.println(x);
    }     
}   
