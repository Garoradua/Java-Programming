public class search1inBinaryArray {
    public static int firstOcc(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] < 1){
                start = mid+1;
            }else{
                if(mid==0 || arr[mid]!=arr[mid-1]) return mid;
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
   public static void main(String[] args){
    int[] arr = {0,0,0,1,1,1,1};
    int first = firstOcc(arr);
    if(first==-1) System.out.println(first);
    else{
        System.out.println(arr.length-first);
    }
   } 
}
