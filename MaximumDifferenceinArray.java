public class MaximumDifferenceinArray {
    public static void main(String[] args){
        int[] arr = {30,10,8,2};
        int n = arr.length;
        int max = Integer.MIN_VALUE;;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]-arr[i]>max){
                    max = arr[j]-arr[i];
                }
            }
        }
        System.out.println(max);
    }
}
