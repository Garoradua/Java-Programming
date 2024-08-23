public class checkSubSequence {
    public static void main(String[] args){
        String s1 = "geeksfor";
        String s2 = "forg";
        subSequence(s1, s2);
    }

    private static void subSequence(String s1, String s2) {
        int i = 0;
        int j = 0;
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j==s2.length()) System.out.println("Yes");
        else System.out.println("no");
    }
}
