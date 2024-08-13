
public class goodPairs {
    public static int sumOfSquares(int[] nums) {
        int length = nums.length;
        int result = 0;
        for(int i=0; i<length; i++){
            int x = i+1;
            if((length%x)==0) {
                x = nums[i]*nums[i];
                System.out.println(x);
                result += x;
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        int[] arr = {2,7,1,19,18,3};
        int  a = 7, b = 2, c = 3;
        int x = sumOfSquares(arr);
        System.out.println(x);
    }
}
