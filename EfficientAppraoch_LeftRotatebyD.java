public class EfficientAppraoch_LeftRotatebyD {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int d = 2;
        int n = 5;
        rotate(arr,0,d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void rotate(int[] arr, int left, int right){
        while(left<right){
           int temp = arr[right];
           arr[right] = arr[left];
           arr[left] = temp;
           left++;
           right--;
        }
    }
}
