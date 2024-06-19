public class Efficient_trapping_rain_water {
    public static void main(String[] args){
        int[] arr = {3,0,1,2,5};
        int n = arr.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        int volume = 0;
        for(int i=1; i<n-1; i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }
        rmax[n-1] = arr[n-1];
        for(int i=n-2; i>0; i--){
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }
        for(int i=1; i<n-1; i++){
            volume += Math.min(lmax[i],rmax[i])-arr[i];
        }
        System.out.println(volume);
    }
}
