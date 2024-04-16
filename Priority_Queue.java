import java.util.*;
// import java.util.PriorityQueue;
public class Priority_Queue {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<=5; i++){
            pq.add(i);
        }

        System.out.println(pq);
        pq.poll();
        pq.poll();
        pq.poll();
        System.out.println(pq);
    }
}
