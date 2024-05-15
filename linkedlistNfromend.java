public class linkedlistNfromend {
    public static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        // linkedlistNfromend obj = new linkedlistNfromend();
        // linkedlistNfromend.Node head = obj.new Node(1);
        Node head = new Node(0);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        // printList(head);
        head = reverseList(head);
        printList(head);
    }
    private static Node reverseList(Node head) {
       Node prev = null;
       Node current = head;
       Node nextnode = head;
        while(nextnode!=null){
            nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;
        }
        return prev;
    }
}
