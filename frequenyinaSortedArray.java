public class frequenyinaSortedArray {
    public static void main(String[] args){
        int arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10,10};
        int freq = 1;
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]) freq++;
            else {
                System.out.print("Frequency of "+arr[i-1] +" is "+freq);
                freq=1;
                System.out.println();
            }
        }
        System.out.println("Frequency of "+arr[n-1] +" is "+freq);
    }
}
