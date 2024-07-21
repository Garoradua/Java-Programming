import java.util.Stack;
public class stackOperations {
    public static boolean checkSequence(String str){
        // Stack<Integer> s = new Stack<>();
        Stack<Character> s  = new Stack<>();
        char[] charArray = str.toCharArray();
        for(char ch : charArray){
            if(ch=='{' || ch =='[' || ch == '('){
                s.push(ch);
            }else if(ch=='}' || ch ==']' || ch == ')'){
                if(s.isEmpty() || !sequence(s.pop(), ch)){
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean sequence(char open, char close){
        return(open =='{' && close =='}' || 
           open =='[' && close ==']' ||
           open =='(' && close ==')' );
    }
    public static void main(String[] args){
        String str = "{[(abc)]}";
        System.out.println(checkSequence(str));
    }
}
