public class secondLargestInArray {
    public static void main(String[] args){
        int arr[] = {10,500, 200,5,20,8,100};
        int max = 0;
        int second_max = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[second_max]){
                if(arr[i]>arr[max]){
                    second_max = max;
                    max = i;
                }else second_max = i;
            }
        }
        System.out.println(second_max);
    }
}
