public class MovesZerostoEnd {
    public static void main(String[] args){
        int[] arr = {10,5};
        int len = arr.length;
        for(int i=0; i<len; i++){
            if(arr[i]==0){
                for(int j=i+1; j<len; j++){
                    if(arr[j]!=0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
        for(int i=0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
