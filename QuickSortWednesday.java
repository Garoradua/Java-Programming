public class QuickSortWednesday {

    public static void quick(int[] arr, int si, int ei){
        if(si < ei){
        int pivotIndex = partition(arr,si,ei);
        quick(arr, 0, pivotIndex-1);
        quick(arr, pivotIndex+1, ei);
        }
    }

    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int smallNo = si-1;
        for(int i=si; i<=ei; i++){
            if(arr[i]<pivot){
                smallNo++;
                int temp = arr[i];
                arr[i]  =arr[smallNo];
                arr[smallNo] = temp;
            }
        }
        smallNo++;
        int temp = arr[ei];
        arr[ei]  =arr[smallNo];
        arr[smallNo] = temp;
        return smallNo;
    }
    public static void main(String[] args){
        int[] arr = {100, 2,1,3,5,3,56,3,5,7,3,2,4,5,6,7,8, -1};
        quick(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
