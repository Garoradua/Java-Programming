public class leadersinArray {
    public static void main(String[] args){
        int[] arr = {7,10,4,3,6,5,2};
        int n = arr.length;
        for(int i=0; i<n; i++){
            boolean flag = true;
            for(int j=i+1; j<n; j++){
                if(arr[j]>=arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(arr[i] + " ");
        }
    }
}
