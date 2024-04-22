class RT1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        }
    }
}
class RT2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("-------------------------------------------------");
        }
    }
}
public class ImplementingRunnableInterface {
    public static void main(String[] args){
        RT1 T1 = new RT1();
        RT2 T2 = new RT2();

        Thread H1 = new Thread(T1);
        Thread H2 = new Thread(T2);

        H1.start();
        H2.start();
    }
}
