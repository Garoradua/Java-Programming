//Problem #3 : Largest Sum Subarray
//
//Description : We are given an array of positive and negative integers. We have to find the subarray having maximum sum.
//        Input
//[-3, 4, -1, -2, 1, 5]
//Output
//7
//        (4+(-1)+(-2)+1+5)
public class largestSumSubarray {
    public static void main(String[] args){
    int[] arr = {-3, 4, -1, -2, 1, 5};
    int n = arr.length;
    int sum = arr[0];
    int res = 0;
    for(int i=1; i<n; i++){
        sum = Math.max(arr[i], arr[i]+sum);
        res = Math.max(res ,sum);
    }
        System.out.println(res);
}
}
