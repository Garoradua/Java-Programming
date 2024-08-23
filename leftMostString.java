public class leftMostString {
    public static void main(String[] args){
        String str = "abcd";
        int n = str.length();
        int result = -1;
        int[] arr = new int[26];
        for(int i=n-1; i>=0; i--){
            if(arr[str.charAt(i)-'a'] != 0){
                result = i;
            }
            arr[str.charAt(i)-'a']++;
        }
        System.out.println(result);
    }
}
