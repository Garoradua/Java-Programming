public class leftMostNonRepeating {
    public static void main(String[] args){
        int[] arr = new int[26];
        String str = "apple";
        int result = -1;
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'a']++;
        }
        // for(int i=0; i<str.length(); i++){
        //     System.out.println(str.charAt(i) + " " + arr[str.charAt(i)-'a']);
        // }
        for(int i=0; i<str.length(); i++){
            if(arr[str.charAt(i)-'a']==1){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
