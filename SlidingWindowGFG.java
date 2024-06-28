public class SlidingWindowGFG {
    public static void main(String[] args){
        int[] arr = {1, 8, 30, -5, 20, 7};
        int k = 3;
        int sum=0;
        int n = arr.length;
        if(k>n) System.out.println("Invalid");
        for(int i=0; i<k; i++){
            sum += arr[i];
        }

        int maximum = sum;
        for(int i=k; i<n; i++){
            sum = sum+arr[i]-arr[i-k];
            maximum = Math.max(sum,maximum);
        }
        System.out.println(maximum);
    }

}
