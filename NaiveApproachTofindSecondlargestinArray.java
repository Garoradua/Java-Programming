public class NaiveApproachTofindSecondlargestinArray {
    public static void main(String[] args){
        int[] arr = {5,20,12,18,20,10};
        int max = largest(arr, 5);
        int res = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=arr[max]){
                if(res==-1) res = i;
                else{
                    if(arr[i]>arr[res])
                        res = i;
                }
            }
        }
        System.out.println(res);
    }
    public static int largest(int[] arr, int size){
        int max = 0;
        for(int i=1; i<size; i++){
            if(arr[i]>arr[max])
                max = i;
        }
        return max;
    }
}
