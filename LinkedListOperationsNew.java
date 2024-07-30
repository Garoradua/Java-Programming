class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
    }
}

public class LinkedListOperationsNew {
    public static Node1 head;

    public static void printLinkedList(Node1 head){
        Node1 temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node1 reverseLinkedList(Node1 head){
        Node1 prev = null;
        Node1 curr = head;
        Node1 nextNode = head;

        while(nextNode!=null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    private static int middleLinkedList(Node1 head) {
        Node1 slowPointer = head;
        Node1 fastPointer = head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer.data;
    }

    public static void addData(int data){
        System.out.println(data);
        Node1 node = new Node1(data);
        if(head==null){
            head = node;
        }else{
            Node1 curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = node;
        }

    }

    public static void main(String[] args){
        // LinkedListOperationsNew list = new LinkedListOperationsNew();
        addData(1);
        addData(2);
        addData(3);
        addData(4);
        addData(5);
        addData(6);
        addData(7);
        printLinkedList(head);
        head = reverseLinkedList(head);
        System.out.println();
        printLinkedList(head);
        head = reverseLinkedList(head);
        int data = middleLinkedList(head);
        System.out.println();
        printLinkedList(head);
        System.out.println();
        System.out.println(data);
    }

    
}
