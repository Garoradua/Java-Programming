import java.util.Stack;
public class printSnakePattern {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},
                        {5,6,7,8}};
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i%2==0){
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    s.push(arr[i][j]);
                }
            }
            while(!s.isEmpty()){
                System.out.print(s.pop() + " ");
            }
        }
    }
}
