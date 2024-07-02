class Node{
    int data;
    Node next;
    Node(int value){
        this.data = value;
        this.next = null;
    }

        }
public class LinkedList1 {

    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node nextnode = null;

        while(curr!=null){
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);
        System.out.println();
        head = reverseList(head);
        printList(head);
    }
}
