public class SlidingWindowApproach {
    public static void main(String[] args){
       int[] arr = {5,-10,6,90,3};
       int k=2;
       int sum =0;
       int curr=0;
       int n = arr.length;
       for(int i=0; i<k; i++){
           curr += arr[i];
       }
       sum = curr;
       for(int i=k; i<n; i++){
           curr = curr + arr[i] - arr[i-k];
           sum = Math.max(sum,curr);
       }
        System.out.println(sum);
    }
}
