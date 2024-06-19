public class MaximumInSubarray {
    public static void main(String[] args){
        int[] arr = {2,3,-8,7,-1,2,3};
        int sum = 0;
        int max = 0;
        int n = arr.length;
        int[] temp = new int[n];
        temp[0] = arr[0];
        sum = arr[0];
        for(int i=1; i<n; i++){
            if(sum+arr[i] > arr[i]){
                sum += arr[i];
                max = Math.max(max,sum);
            }else{
                sum = arr[i];
                max = Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
}
