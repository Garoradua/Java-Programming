public class linkedListJava {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args){
        linkedListJava list = new linkedListJava();
       list.head = new Node(85);
       list.head.next = new Node(15);
       list.head.next.next = new Node(4);
       list.head.next.next.next = new Node(20);

       printList(head);
       head = reverseList(head);
       printList(head);
    }
    private static Node reverseList(Node head) {
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
    private static void printList(Node head) {
       while(head!=null){
        System.out.println(head.data);
        head = head.next;
       }
    }
}
