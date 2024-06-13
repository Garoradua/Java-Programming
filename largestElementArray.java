public class largestElementArray {
    public static void main(String[] args){
        //largest element in array
        int arr[] = {10,200,5,20,8,100};
        int max_array_index = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[max_array_index])
                max_array_index = i;
        }
        System.out.println(max_array_index);
    }
}
