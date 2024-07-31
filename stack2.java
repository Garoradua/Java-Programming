import java.util.Stack;
public class stack2 {
    public static boolean checkSequence(String str){
        Stack<Character> s = new Stack<>();
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if(c=='(' || c=='[' || c=='{') s.push(c);
            else if(c==')' || c==']' || c=='}'){
                if(s.isEmpty() || !check(s.pop(), c)){
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static boolean check(char open, char close){
        return (open=='(' && close == ')' ||
        open=='[' && close == ']' ||
        open=='{' && close == '}');
    }
    public static void main(String[] args){
        String str = "[{{abc}}]";
        System.out.println(checkSequence(str));
    }
}
