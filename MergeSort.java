class MergeSort{
    public static void main(String[] args){
        int[] arr = {3,2,1,5,6,8};
        int n = arr.length;
        divide(arr,0,n-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void divide(int[] arr, int startIndex, int endIndex) {
        if(startIndex>=endIndex) return;
        int mid = startIndex + (endIndex-startIndex)/2;
        divide(arr,startIndex,mid);
        divide(arr,mid+1,endIndex);
        conquer(arr,startIndex,mid,endIndex);
    }

    private static void conquer(int[] arr, int startIndex, int mid, int endIndex) {
        int left = startIndex;
        int right = mid+1;
        int[] temp = new int[endIndex-startIndex + 1];
        int x = 0;
        while(left <=mid && right <= endIndex){
            if(arr[left]<=arr[right]){
                temp[x++] = arr[left++];
            }else{
                temp[x++] = arr[right++];
            }
        }
        while(left <=mid){
            temp[x++] = arr[left++];
        }
        while(right <= endIndex){
            temp[x++] = arr[right++];
        }

        for(int i=0; i<temp.length; i++){
            arr[i + startIndex] = temp[i];
        }
    }
}