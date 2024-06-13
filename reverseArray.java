public class reverseArray {
    public static void main(String[] args){
        int[] arr = {10,5,7,30,40};
        int length = arr.length;
        for(int i=0; i<length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<length/2; i++){
            int temp = arr[length-1-i];
            arr[length-1-i] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
