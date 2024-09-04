public class binarysearchGFG {
    // public static int binarySearch(int start, int end, int[] arr, int target){
    //     if(start>end) return -1;
    //     int mid = start + (end-start)/2;
    //         if(arr[mid]==target) return mid;
    //         if(target > arr[mid]) {
    //             return binarySearch(mid+1, end, arr, target);
    //         }else{
    //             return binarySearch(start, mid-1, arr, target);
    //         }
    // }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        int target = 5;
        int end = arr.length-1;
        int start = 0;
        // System.out.println(binarySearch(start, end, arr, target));
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) {
                System.out.println(mid);
                break;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        
    }
}
