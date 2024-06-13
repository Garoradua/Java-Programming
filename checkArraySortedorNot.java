public class checkArraySortedorNot {
    public static void main(String[] args){
        int[] arr = {8,10,10,12,15,16};

        String res = sortedHelper(arr) ? "Yes" : "No" ;
        System.out.println(res);
    }
        public static boolean sortedHelper(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
