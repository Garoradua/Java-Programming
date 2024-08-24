import java.util.Scanner;
public class ReverseWordsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        int start = 0;
        for(int end = 0; end<charArray.length; end++){
            if(str.charAt(end)==' '){
                reverse(charArray, start, end-1);
                start = end+1;
            }
        }
        reverse(charArray, start, charArray.length-1);
        reverse(charArray, 0, charArray.length-1);
        str = new String(charArray);
        System.out.println(str);
    }
    public static void reverse(char[] charArray, int low, int high){
        while(low<high){
            char a = charArray[low];
            charArray[low] = charArray[high];
            charArray[high] = a;
            low++;
            high--;
        }
    }
}
