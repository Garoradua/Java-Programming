public class LeftRotateby1 {
    public static void main(String[] args){
        int[] arr = {7,8,0,1,2,6,0};
        int temp = arr[0];
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<arr.length-1; i++){
            arr[i]  = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
