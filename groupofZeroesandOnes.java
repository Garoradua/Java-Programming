public class groupofZerosandOnes {
    public static void main(String[] args){
        int[] arr = {1,0,1,0,0,1,0,1,1,0,1};
        int n = arr.length;
        int i=0;
        int groupOfZeroes = 0;
        int groupOfOnes = 0;
        while(i<n){
            if(arr[i]==1){
                groupOfOnes++;
                while(i<n && arr[i]==1){
                    i++;
                }
            }else{
                groupOfZeroes++;
                while(i<n && arr[i]==0){
                    i++;
                }
            }
        }
        System.out.println(groupOfZeroes);
        System.out.println(groupOfOnes);
    }
}
