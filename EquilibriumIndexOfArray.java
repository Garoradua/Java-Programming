//Problem #2 : Equilibrium index of an array
//
//Description - Equilibrium index of an array is an index such that the sum of elements at lower
// indexes is equal to the sum of elements at higher indexes. We are given an Array of integers,
// We have to find out the first index i from left such that -
//A[0] + A[1] + ... A[i-1] = A[i+1] + A[i+2] ... A[n-1]
//
//
//Input
//[-7, 1, 5, 2, -4, 3, 0]
//Output
//3
//A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
public class EquilibriumIndexOfArray {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int n = arr.length;
        int prefixSum[] = new int[n];
        int suffixSum[] = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i]);
        }
        suffixSum[n-1] = arr[n-1];
        System.out.println();
        for(int i=n-2; i>=0; i--){
            suffixSum[i] = suffixSum[i+1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(suffixSum[i]);
        }
        System.out.println();
        for(int i=0; i<n; i++){
            if(i==0) {
                if(suffixSum[i+1]==0) {
                    System.out.println("True");
                    break;
                }

            }else if(i==n-1){
                if(prefixSum[i-1]==0) {
                    System.out.println("True");
                    break;
                }

            }else{
                if(prefixSum[i-1]==suffixSum[i+1]){
                    System.out.println("True");
                    break;
                }
            }
        }
    }
}
