public class MergeSortMonday {

    public static void conquer(int[] arr, int si, int mid, int ei){
        int leftStart = si;
        int rightStart = mid+1;
        int x = 0;
        int[] temp = new int[ei-si + 1];
        while(leftStart<=mid && rightStart<=ei){
            if(arr[leftStart] <= arr[rightStart]){
                temp[x++] = arr[leftStart++];
            }else{
                temp[x++] = arr[rightStart++];
            }
        }
        while(leftStart<=mid){
            temp[x++] = arr[leftStart++];
        }
        while(rightStart<=ei){
            temp[x++] = arr[rightStart++];
        }

        for(int i=0, j=si; i<temp.length; i++){
            arr[j++] = temp[i];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei) return;
        int mid = si + (ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,54,3,45,2,4,5};
        int n = arr.length;
        divide(arr,0,n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
