public class findSQRTusingBinarySearch {
    public static void main(String[] args){
        int number  = 24;
        int low = 0;
        int high = number;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid*mid ==number){
                System.out.println(mid);
                return;
            }
            else if(mid*mid > number){
                high = mid-1;
            }else if(mid*mid < number){
                low = mid+1;
                ans = mid;
            }
        }
        System.out.println(ans);
    }
}
