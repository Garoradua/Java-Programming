public class QuickSort{
    public static void main(String[] args){
        int[] arr = {1,6,4,5,6,9,1};
        int n = arr.length;
        QuickSortFucn(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void QuickSortFucn(int[] arr, int start, int end) {
        if(start < end){
        int pivotindex = partition(arr,start,end);
        QuickSortFucn(arr,start,pivotindex-1);
        QuickSortFucn(arr,pivotindex+1,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int smallNo= start-1;
        int pivot = arr[end];
            for(int i = start; i<end; i++){
                if(arr[i] < pivot){
                    smallNo++;
                    int temp  = arr[i];
                    arr[i] = arr[smallNo];
                    arr[smallNo] = temp;
                }
            }
            smallNo++;
            int temp  = arr[end];
            arr[end] = arr[smallNo];
            arr[smallNo] = temp;
        return smallNo;
    }
}