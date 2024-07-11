class Node{
    int data;
    Node next;

    Node(int val){
        this.data  = val;
        this.next = null;
    }
}
public class linkedListOperations {
    public static void Print(Node root){
        Node temp = root;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node reverseList(Node root){
        Node curr = root;
        Node nextNode = root;
        Node prev = null;

        while(curr!=null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void middleElement(Node root){
        Node slowPointer = root;
        Node fastPointer = root;

        while(fastPointer!=null && fastPointer.next !=null ){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        System.out.println(slowPointer.data);
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);
        Print(root);
        root = reverseList(root);
        System.out.println();
        Print(root);
        root = reverseList(root);
        System.out.println();
        Print(root);
        middleElement(root);
    }
}
