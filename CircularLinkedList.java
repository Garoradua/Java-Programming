import java.util.Scanner;

class CNode{
    int data;
    CNode next;
    CNode(int data){
        this.data = data;
        next = null;
    }
}
public class CircularLinkedList {

    public static void printCircularLinkedList(CNode head){
        if(head==null) return;
        // CNode temp = head;
        System.out.println(head.data);
        for(CNode temp = head.next; temp!=head; temp = temp.next){
            System.out.println(temp.data);
        }
        // while(temp!=head){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
    }
    public static void main(String[] args){
        CNode head = new CNode(1);
        CNode temp1 = new CNode(2);
        CNode temp2 = new CNode(3);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = head;

        printCircularLinkedList(head);
        Scanner sc = new Scanner(System.in);
        System.out.println();
        // head = insertAtBeginning(head, sc);
        // System.out.println();
        printCircularLinkedList(head);
        // System.out.println();
        // // head = insertAtEnd(head, sc);
        // System.out.println();
        // printCircularLinkedList(head);
        // System.out.println();
        // head = deleteHeadCircular(head, sc);
        System.out.println();
        printCircularLinkedList(head);
        System.out.println();
        head = deleteKthNode(head, sc);
        printCircularLinkedList(head);
        System.out.println();
        
    }
    private static CNode deleteKthNode(CNode head, Scanner sc) {
       
        System.out.println("Enter k");
        int x = sc.nextInt();
        if(head==null || head.next==head) return null;
        if(x==1){
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }
        CNode curr = head;
        for(int i=1; i<=x-2; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
    private static CNode deleteHeadCircular(CNode head, Scanner sc) {
        if(head==null) return null;
        if(head.next==head) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    private static CNode insertAtEnd(CNode head, Scanner sc) {
        int data = sc.nextInt();
        CNode newnode = new CNode(data);
        if(head==null){
            newnode.next = newnode;
            return newnode;
        }
        newnode.next = head.next;
        head.next = newnode;
        newnode.data = head.data;
        head.data = data;
        return newnode;
    }
    private static CNode insertAtBeginning(CNode head, Scanner sc) {
        int data = sc.nextInt();
        CNode newnode = new CNode(data);
        if(head==null){
            newnode.next = newnode;
            return newnode;
        }
        data = head.data;
        head.data = newnode.data;
        newnode.next = head.next;
        head.next = newnode;
        newnode.data = data;
        return head;
        
    }
}
