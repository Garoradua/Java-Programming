import java.util.ArrayDeque;
public class Array_Dequeue {
    public static void main(String[] args){
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.add(1);
        ad.addFirst(2);
        ad.addLast(3);
        ad.add(5);
        ad.addFirst(6);
        ad.add(7);

        System.out.println(ad);
        // ad
        System.out.println(ad.getLast());
        System.out.println(ad.getFirst());

        ad.removeLast();
        ad.removeFirst();
        System.out.println(ad);
    }
}
