public class optimizedAnagram {
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";
        int[] charPallindrome = new int[26];

        for(int i=0; i<str1.length(); i++){
            charPallindrome[str1.charAt(i)-'a']++;
            charPallindrome[str2.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(charPallindrome[i] !=0) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("true");
    }
}
