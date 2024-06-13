public class deleteoperationsArray {
    public static void main(String[] args){
        int[] arr = {3,2,9,5,15,12};
        int size = arr.length;
        int result = deleteoperation(arr, size, 30);
        System.out.println(result);
    }
    public static int deleteoperation(int[] arr, int n, int x ){
        int i;
        for(i=0; i<n; i++){
            if(arr[i]==x){
                break;
            }
        }
        if(i==n) return n;
        for(int j=i; j<n-1; j++){
            arr[j] = arr[j+1];
        }
        return n-1;
    }
}
