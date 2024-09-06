public class countNoOfOccurences {
    public static int firstOcc(int start, int end, int[] arr, int target){
        while(start<=end){
        int mid = (start+end)/2;

        if(target > arr[mid]){
            start = mid+1;
        }else if(target < arr[mid]){
            end = mid-1;
        }else{
            if(mid==0 || arr[mid]!=arr[mid-1]) return mid;
            else{
                end = mid-1;
            }
        }
    
        }
        return -1;
    }
    public static int secondOcc(int start, int end, int[] arr, int target){
        int n = arr.length;
        while(start<=end){
        int mid = (start+end)/2;

        if(target > arr[mid]){
            start = mid+1;
        }else if(target < arr[mid]){
            end = mid-1;
        }else{
            if(mid==n-1 || arr[mid]!=arr[mid+1]) return mid;
            else{
                start = mid+1;
            }
        }
        
    }
    return -1;
    }

    public static void main(String[] args){
        int[] arr = {0,0,0,1,1,1,1};
        int len = arr.length;
        int start = 0;
        int end = len-1;
        int target = 1;
        int first = firstOcc(start,end,arr, target);
        if(first==-1){
            System.out.println("0");
            return;
        }
        System.out.println(secondOcc(start,end,arr, target) - first + 1);
    }
}
