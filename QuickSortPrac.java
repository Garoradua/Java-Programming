public class QuickSortPrac {
    public static void main(String[] args){
        int[] arr = {2,1,5,3,7,8,9,4};
        quick(arr, 0, arr.length-1);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quick(int[] arr, int start, int end){
        if(start < end) {
            int pivotIndex = partition(arr, start, end);
            quick(arr, start, pivotIndex - 1);
            quick(arr, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int smallNo = start - 1;
        for(int i=start; i<=end; i++){
            if(arr[i]>pivot){
                smallNo++;
                int temp = arr[i];
                arr[i] = arr[smallNo];
                arr[smallNo] = temp;
            }
        }
        smallNo++;
        int temp = arr[smallNo];
        arr[smallNo] = arr[end];
        arr[end] = temp;
        return smallNo;
    }
}
