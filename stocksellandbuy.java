public class stocksellandbuy {
<<<<<<< HEAD
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;
        int res=0;
        for(int i=1; i<n ;i++){
            if(arr[i]>arr[i-1]) res += arr[i]-arr[i-1];
        }
        System.out.println(res);
=======
    public  static void main(String[] args){
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int n = arr.length;
        int profit = 0;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]) profit += arr[i]-arr[i-1];
        }
        System.out.println(profit);
>>>>>>> 6b191dbd81e215ae8ae3a4017874967dc64049b6
    }
}
