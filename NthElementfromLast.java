public class NthElementfromLast {
    private static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        printList(head);
        int n=2;
        nthfromEND(n, head);

    }
    private static void nthfromEND(int n, Node head) {
        Node firstPointer = head;
        Node secondPointer = head;

        for(int i=1; i<n; i++){
            firstPointer = firstPointer.next;
        }
        System.out.println(firstPointer.data);
        while(firstPointer.next !=null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        System.out.println(secondPointer.data);

    }
    private static void printList(Node head) {
        Node temp = head;
       while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
       }
    }
}
