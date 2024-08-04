public class print1toNusingRecursion {
    public static void printAllValues(int n){
        if(n==0) return;
        printAllValues(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        int n = 10;
        printAllValues(n);
    }
}
