public class MaximumConsecutiveOnes {
    public static void main(String[] args){
        int arr[] = {1,0,1,1,1,1,0,1,1};
        int freq = 1;
        int max_freq = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1] && arr[i]==1){
                freq++;
                max_freq = Math.max(max_freq, freq);
            }else freq = 1;
            
        }
        System.out.println(max_freq);
    }
}
