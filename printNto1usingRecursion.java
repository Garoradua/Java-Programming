public class printNto1usingRecursion {
    public static void  printAllvalues(int n){
        if(n==0) return;
        System.out.println(n);
        printAllvalues(n-1);
    }
    public static void main(String[] args){
        int n = 10;
        printAllvalues(n);
    }
}
