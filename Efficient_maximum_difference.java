public class Efficient_maximum_difference {
    public static void main(String[] args){
        int[] arr = {2,3,10,6,4,8,1};
        int n = arr.length;
        int maxdiff = Integer.MIN_VALUE;
        int min_value = arr[0];

        for(int i=1; i<n; i++){
            maxdiff = Math.max(maxdiff, arr[i]-min_value);
            min_value = Math.min(min_value,arr[i]);
        }
        System.out.println(maxdiff);
    }
}
