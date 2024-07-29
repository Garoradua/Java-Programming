public class QuickSortMonday {

    public static void QuickSort(int[] arr, int start, int end){
        if(start<end){
        int pivotIndex = partition(arr, start, end);
        QuickSort(arr, start, pivotIndex-1);
        QuickSort(arr, pivotIndex+1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivotElement = arr[end];
        int smallNo = start-1;
        for(int i=start; i<end; i++){
            if(arr[i]<=pivotElement){
                smallNo++;
                int temp = arr[smallNo];
                arr[smallNo] = arr[i];
                arr[i] = temp;
            }
        }
        smallNo++;
        int temp = arr[smallNo];
        arr[smallNo] = arr[end];
        arr[end] = temp;
        return smallNo;
    }

    public static void main(String[] args){
        int[] arr = {4,6,32,5,6,2,1,5};
        int n = arr.length;
        QuickSort(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
