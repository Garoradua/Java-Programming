public class indexOffirstOccurenceinBinarySearch {
    public static void main(String[] args){
        int[] arr = {20,20,20,20,20};
        int len = arr.length;
        int low = 0;
        int high = len-1;
        int target = 20;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                while(mid-1 >=0 && target==arr[mid-1]){
                    mid = mid-1;
                }
                System.out.println(mid);
                break;
            }else if(target > arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    }
}
