public class recursion1 {
    public static void fun(int n){
        if(n==0) return;
        System.out.println("Hello");
        fun(n-1);
    }
    public static void main(String[] args){
        fun(2);
    }
}
