public class prefixSumGFG {
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 8, 9, 2};
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        getSum(prefixSum, 0, 3 );
    }
    public static void getSum(int[] prefixSum, int start, int end){
        if(start==0) System.out.println(prefixSum[end]);
        else System.out.println(prefixSum[end]-prefixSum[start-1]);
    }
}
