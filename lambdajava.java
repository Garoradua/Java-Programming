interface Sum{
    public void sum(int a, int b);
}
public class lambdajava{
    public static void main(String[] args){
        Sum obj = (a,b) ->{
            System.out.println(a+b);
        };
        obj.sum(2,5);
    }
}