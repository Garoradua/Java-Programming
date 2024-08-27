public class PatternSearchingString {
    public static void main(String[] args){
        String str1 = "abcabcabcba";
        String str2 = "abcabc";

        for(int i=0; i<=str1.length()-str2.length(); i++){
            int j;
            for(j=0; j<str2.length(); j++){
                if(str1.charAt(i+j)!=str2.charAt(j)){
                    break;
                }
            }
            if(j==str2.length()){
                System.out.println(i);
            }
        }
    }
}
