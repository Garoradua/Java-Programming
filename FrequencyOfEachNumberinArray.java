public class FrequencyOfEachNumberinArray {
    public static void main(String[] args){
        int[] arr = {10};
        int freq = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1])
                freq++;
            else{
                System.out.print(arr[i-1] + " " + freq);
                System.out.println();
                freq=1;
            }
        }
        System.out.print(arr[arr.length-1] + " " + freq);
    }
}