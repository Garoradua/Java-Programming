public class TrappingRainWater {
    public static void main(String[] args){
        int arr[] = {1,2,3,2,3};
        int volume = 0;
        for(int i=1; i<arr.length-1; i++){
            int lmax = arr[i];
            for(int j=0; j<i; j++){
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for(int j=i+1; j<arr.length; j++){
                rmax = Math.max(rmax, arr[j]);
            }

            int min_build = Math.min(lmax,rmax);
            volume += min_build-arr[i];
        }
        System.out.println(volume);
    }
}
