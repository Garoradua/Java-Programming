public class Matercard1 {
    // ["man", "manner", "mankind"]
    public static void main(String[] args){
        String[] stringArray = {"maan", "manner", "mankind"};
        int count = 0;
        int len1 = stringArray[0].length();
        int len2 = stringArray[1].length();
        int len3 = stringArray[2].length();
        // stringArray[0].charAt(0);
        int i=0, j=0, k=0;
        // char[] charArray = stringArray[0].toCharArray(); 
        while(i<len1 && j<len2 && k <len3){
            if((stringArray[0].charAt(i)) ==  (stringArray[1].charAt(j))){
                if((stringArray[0].charAt(i)) ==(stringArray[2].charAt(k)) ){
                    count++;
                    System.out.print(stringArray[0].charAt(i));
                }
            }
            i++; j++; k++;
        }
        System.out.println();
        System.out.println(count);
    }
}
