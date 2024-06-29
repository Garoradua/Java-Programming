public class MaximumAppearing {
    public static void main(String[] args){
        int[] left = {1,2,5,15};
        int[] right = {5,8,7,18};
        int freq[] = new int[101];
        int n = left.length;

        for(int i=0; i<n; i++){
           freq[left[i]]++;
           freq[right[i]+1]--;
        }
        int res  = 0;
        for(int i=1; i<=100; i++){
            freq[i] = freq[i-1]+freq[i];
            if(freq[i]>freq[res]){
                res = i;
            }
        }

        System.out.println(res);
    }
}
