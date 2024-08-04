public class print1toNusingRecursion {
    public static void printAllValues(int n, int target){
        if(n==target) return;
        System.out.println(n);
        printAllValues(n+1, target);
    }
    public static void main(String[] args){
        int n = 10;
        printAllValues(1, n+1);
    }
}
