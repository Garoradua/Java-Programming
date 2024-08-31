import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}
public class DoublyLinkedList {
    public static Node insertAtBeginning(Node head, Scanner sc){
        System.out.println("Enter the element you want to add at beginning \t");
        int x = sc.nextInt();
        Node newNode = new Node(x);
        if(head!=null){
            head.prev = newNode;
        }
        newNode.next = head;
        return newNode;
    }
    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node insertAtEnd(Node head, Scanner sc){
        System.out.println("Enter the element you want to add at end \t");
        int x = sc.nextInt();
        Node newNode = new Node(x);
        if(head==null) return newNode;
        Node temp  = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    public static Node reverseDoublyLL(Node head){
        if(head==null || head.next==null) return head;
        Node previous = null;
        Node temp = head;

        while(temp!=null){
            previous = temp.prev;
            temp.prev = temp.next;
            temp.next = previous;
            temp = temp.prev;
        }
        return previous.prev;
    }

    public static Node deleteHead(Node head){
        if(head==null || head.next==null) return null;

        head = head.next;
        head.prev = null;
        return head;
    }
    public static Node deleteLastNode(Node head){
        if(head==null || head.next==null) return null;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        Node temp1 = new Node(2);
        Node temp2 = new Node(3);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        Scanner sc = new Scanner(System.in);
        printLinkedList(head);
        head = insertAtBeginning(head, sc);
        System.out.println();
        printLinkedList(head);
        head = insertAtEnd(head, sc);
        System.out.println();
        printLinkedList(head);
        head = reverseDoublyLL(head);
        System.out.println();
        printLinkedList(head);
        head = deleteHead(head);
        System.out.println();
        printLinkedList(head);
        head = deleteLastNode(head);
        System.out.println();
        printLinkedList(head);
    }
}
