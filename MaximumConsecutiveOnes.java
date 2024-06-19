public class MaximumConsecutiveOnes {
    public static void main(String[] args){
        int arr[] = {1,0,1,1,0};
        int freq = 0;
        int max_freq = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
                freq = 0;  
            else{
                freq++;
                max_freq = Math.max(max_freq, freq);
            }

            
        }
        System.out.println(max_freq);
    }
}
