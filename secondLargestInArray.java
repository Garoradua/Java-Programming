public class secondLargestInArray {
    public static void main(String[] args){
        int arr[] = {9,10,10,10,5,7};
        int max = 0;
        int second_max = -1;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[max]){
                second_max = max;
                max = i;
            }else if(arr[i] != arr[max]){
                if(second_max == -1 || arr[second_max] < arr[i])
                    second_max = i;
                }
        }
        System.out.println(second_max);
    }
}
