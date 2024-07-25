class ThT1 implements Runnable{
    public void run(){
        while(true){
        System.out.println("||||||||||||||||||||||||||||||||||");
        }
    }
}

class ThT2 implements Runnable{
    public void run(){
        while(true){
        System.out.println("------------------------------");
        }
    }
}

public class MultithreadingKK {
    public static void main(String[] args){
    ThT1 T1 = new ThT1();
    ThT2 T2 = new ThT2();

    Thread H1 = new Thread(T1);
    Thread H2 = new Thread(T2);

    H1.start();
    H2.start();
    }
}
