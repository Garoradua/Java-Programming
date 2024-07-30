public class BinarySearchNew {

    public static int binarySearch(int[] arr, int start, int end, int target){
        if(start==end && arr[start]!=target){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid]>target){
            return binarySearch(arr,0,mid-1, target);
        }else{
            return binarySearch(arr,mid+1,end, target);
        }
    }
    public static void main(String[] args){
    int[] arr = {1 ,2 ,2 ,3 ,3, 4, 5, 45, 54};
    int target = 0;
    System.out.println(binarySearch(arr,0,arr.length-1, target));
    }
}
