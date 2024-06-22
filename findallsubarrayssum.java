public class findallsubarraysincludingcircular {
    public static void main(String[] args){
        int[] arr = {1,2,-2,-5,3,-1,4};
        int n = arr.length;
        int maximum = findmaxsubarray(arr, n);
        System.out.println(maximum);


    }
    public static int findmaxsubarray(int[] arr, int n){
        int max_normal = maxnormal(arr, n);
//        System.out.println(max_normal);
        if(max_normal<0) return max_normal;
        int arr_sum = 0;
        for(int i=0; i<n; i++){
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + maxnormal(arr,n);
        int result = Math.max(max_normal, max_circular);
        return result;
    }
    public static int maxnormal(int[] arr, int n){
        int sum = 0;
        int maximum = 0;
        for(int i=0; i<n; i++){
            sum = Math.max(sum+arr[i], arr[i]);
//            System.out.println(sum + "sum of - " + arr[i] );
            maximum = Math.max(sum, maximum);
//            System.out.println(maximum + "maximum of - " + arr[i] );
        }
        return maximum;
    }
}
