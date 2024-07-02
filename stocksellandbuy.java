public class stocksellandbuy {
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;
        int res=0;
        for(int i=1; i<n ;i++){
            if(arr[i]>arr[i-1]) res += arr[i]-arr[i-1];
        }
        System.out.println(res);
    }
}
