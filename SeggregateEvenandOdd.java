// class Node{
//     int data;
//     Node next;

//     Node{int data}{
//         this.data = data;
//         next = null;
//     }
// }

import java.util.ArrayList;
import java.util.List;

public class SeggregateEvenandOdd {
    public static void printLinkedList(Node head){
        if(head==null) return;
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static Node segregateEvenOdd(Node head){
        if(head==null) return null;
        Node curr = head;
        List<Integer> evenlist = new ArrayList<Integer>();
        List<Integer> oddlist = new ArrayList<Integer>();

        while(curr!=null){
            if(curr.data %2 ==0) evenlist.add(curr.data);
            else oddlist.add(curr.data);
            curr = curr.next;
        }
        int evenLength = evenlist.size();
        int oddLength = oddlist.size();
        curr = head;
        int i=0;
        while(i< evenLength){
            curr.data = evenlist.get(i);
            curr = curr.next;
            i++;
        }
        i=0;
        while(i< oddLength){
            curr.data = oddlist.get(i);
            curr = curr.next;
            i++;
        }
        return head;
    }
    public static void main(String[] args){
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(5);

        printLinkedList(head);
        System.out.println();
        head = segregateEvenOdd(head);
        printLinkedList(head);
        System.out.println();
        head = EvenOddOptimized(head);
        printLinkedList(head);
    }
    private static Node EvenOddOptimized(Node head) {
        if(head==null) return null;
        Node es = null, ee = null, os = null, oe = null;
        int x;
        for(Node curr = head; curr!=null; curr = curr.next){
            x = curr.data;
            if(x%2!=0){
                if(os==null){
                    os = curr;
                    oe = curr;
                }else{
                    oe.next = curr;
                    oe = curr;
                }
            }else{
                if(es==null){
                    es = curr;
                    ee = curr;
                }else{
                    ee.next = curr;
                    ee = curr;
                }
            }
        }
        if(os==null || es==null) return head;
        ee.next = os;
            return es;
    }
}
