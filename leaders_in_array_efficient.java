public class leaders_in_array_efficient {
        public static void main(String[] args){
            int[] arr = {30,20,10};
            int n  = arr.length;
            int curr_leader = arr[n-1];
            System.out.print(curr_leader + " ");
            for(int i=n-1; i>=0; i--){
                if(arr[i]>curr_leader){
                    curr_leader = arr[i];
                    System.out.print(curr_leader + " ");
                }
            }
        }
}
