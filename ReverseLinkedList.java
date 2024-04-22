public class ReverseLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    static void printList(Node node){
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    static Node reverseList(Node head){
        Node next = null;
        Node prev = null;
        Node currentNode = head;

        while(currentNode != null){
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }
        return prev;
    }
    public static void main(String[] args){
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        printList(head);
        head = reverseList(head);
        printList(head);
    }
}
