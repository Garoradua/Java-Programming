public class MergeSortWednesday {

    public static void divide(int[] arr, int start, int end){
        if(start>=end) return;
        int mid = start + (end-start)/2;
        divide(arr, 0, mid);
        divide(arr, mid+1, end);
        conquer(arr,start,mid,end);
        
    }

    public static void conquer(int[] arr, int start, int mid, int end){
        int si = start;
        int ei = mid+1;
        int x = 0;
        int[] temp =  new int[end-start + 1];
        while(si <=mid && ei <=end){
            if(arr[si]<=arr[ei]){
                temp[x++] = arr[si++];
            }else{
                temp[x++] = arr[ei++];
            }
        }
        while(si <=mid){
            temp[x++] = arr[si++];
        }
        while(ei <=end){
            temp[x++] = arr[ei++];
        }

        for(int i=0; i<temp.length; i++){
            arr[i+start] = temp[i];
        }
    }
    public static void main(String[] args){
        int[] arr = {2,3,5,3,2,4,2,12,45,6,3,3,5,67, -1};
        divide(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
