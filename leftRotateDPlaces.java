public class leftRotateDPlaces {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int d = 4;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<d; i++){
            leftRotate(arr, 5);
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void leftRotate(int[] arr, int n){
         int temp = arr[0];
         for(int i =1; i<arr.length; i++){
            arr[i-1] = arr[i];
         }   
         arr[arr.length-1] = temp;
    }
}
