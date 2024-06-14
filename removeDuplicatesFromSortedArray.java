public class removeDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] arr = {10,20,20,20,30,30,30};
        int length = arr.length;
        int temp[] = new int[length];
        temp[0] = arr[0];
        int res =1;
        for(int j=1; j<length; j++){
            if(temp[res-1]!=arr[j]){
                temp[res] = arr[j];
                res++;
            }
        }
        for(int i=0; i<res; i++){
            arr[i] = temp[i];
        }
        System.out.println(res);
    }
}
