public class MergeTwoSortedLinkedlist {

    public static void printBoth(Node a, Node b){
        while(a!=null){
            System.out.print(a.data + " ");
            a = a.next;
        }
        System.out.println();
        while(b!=null){
            System.out.print(b.data + " ");
            b = b.next;
        }
    }
    public static Node mergeSorted(Node a, Node b){
        if(a==null) return b;
        if(b==null) return a;

        Node head=null, tail=null;
        if(a.data < b.data){
            head  = tail = a;
            a =a.next;
        } 
        else {
            head = tail = b;
            b = b.next;
        }
        while(a!=null && b!=null){
            if(b.data <= a.data){
                tail.next = b;
                b = b.next;
                tail = tail.next;
            }else{
                tail.next = a;
                a = a.next;
                 tail = tail.next;
            }
        }
        if(a==null) tail.next = b;
        else tail.next = a;

        return head;
    }
    public static void printLL(Node head){
        if(head==null) return;
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args){
        Node a = new Node(10);
        a.next = new Node(20);
        a.next.next = new Node(30);
        a.next.next.next= new Node(40);

        Node b = new Node(5);
        b.next = new Node(15);
        b.next.next= new Node(17);
        b.next.next.next= new Node(18);
        b.next.next.next.next= new Node(35);

        printBoth(a, b);
        System.out.println();
        Node head = mergeSorted(a,b);
        printLL(head);
    }
}
