public class insertAtGivenindex {
    public static void main(String[] args){
        int[] arr = new int[5];
        for(int i=0; i<3; i++){
            arr[i] = i+1;
        }
        int pos = 2;
        int val = 4;
        int len = arr.length;
        for(int i = len-2; i>=pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = val;
        len = arr.length;
        for(int i=0; i<len; i++){
            System.out.println(arr[i]);
        }
    }
}
