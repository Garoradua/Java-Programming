public class Maximum_subarray_sum {
    public static void main(String[] args){
        int arr[] = {15, 8,-8,9,-9,24, 10,-11,12};
        int sum = arr[0];
        int maximum = arr[0];

        for(int i=1; i<arr.length; i++){
            sum = Math.max(sum+arr[i], arr[i]);
            maximum = Math.max(maximum, sum);
        }
        System.out.println(maximum);
    }
}
