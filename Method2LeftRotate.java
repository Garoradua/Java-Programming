public class Method2LeftRotate {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int d = 1;
        int[] extra = new int[d];
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<d; i++){
            extra[i] = arr[i];
        }
        int loc = 0;
        for(int i=d; i<arr.length; i++){
            arr[loc++] = arr[i];
        }
        for(int i=0; i<d; i++){
           arr[loc++] = extra[i];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
