public class String_paliindrome {
    public static void main(String[] args){
        String str = "geeks";
        int start = 0;
        int end = str.length()-1;
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("Not Pallindrome");
                return;
            }
        }
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("Not Pallindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Pallindrome");
    }
}
