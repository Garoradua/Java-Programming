class ThreadT1 extends Thread{
    public void run(){
        while(true)
        System.out.println("-------------------");
    }
}
class ThreadT2 extends Thread{
    public void run(){
        while(true)
        System.out.println("|||||||||||||||||||||||||");
    }
}
public class MultiThreadinginjava {
    public static void main(String[] args){
        ThreadT1 T1 = new ThreadT1();
        ThreadT2 T2 = new ThreadT2();
        T1.start();
        T2.start();
    }
}
