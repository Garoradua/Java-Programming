public class LinkedListJava1 {
    public static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
            next = null;
        }
    }

    public static Node linkedlistReverse(Node head){
        Node current = head;
        Node prev = null;
        Node nextnode = head;

        while(nextnode!=null){
            nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;
        }
        return prev;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void middleList(Node head){
        Node slowPointer = head;
        Node fastPointer = head;
        while(fastPointer!=null && fastPointer.next!=null){ //123
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println(slowPointer.data);
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);

        printList(head);
        middleList(head);
        // head = linkedlistReverse(head);
        // System.out.println();
        // printList(head);
    }
}
