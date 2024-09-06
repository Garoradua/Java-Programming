public class indexofLastOccurenceinBinarySearch {
    public static void main(String[] args){
        int[] arr = {10,15,20,20,40,40};
        int low = 0;
        int len = arr.length;
        int high = len-1;
        int target = 20;

        while(low<=high){
            int mid = (low+high)/2;

            if(target > arr[mid]){
                low = mid+1;
            }else if(target < arr[mid]){
                high = mid-1;
            }else{
                if(mid==len-1 || arr[mid]!=arr[mid+1]) {
                    System.out.println(mid);
                    break;
                }
                else low = mid+1;
            }
        }
    }
}
