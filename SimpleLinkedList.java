import java.util.Scanner;

class N{
    int data;
    N next;

    N(int data){
        this.data = data;
        next = null;
    }
}
public class SimpleLinkedList {
    public static N insertAtBeginning(N head, Scanner sc){
        System.out.println("Enter data you want to add ?");
        int newData = sc.nextInt();
        N newNode = new N(newData);
        newNode.next = head;
        return newNode;
    }
    public static void printLinkedList(N head){
        if(head==null) return;
        System.out.println(head.data);
        printLinkedList(head.next);
    }
    public static void main(String[] args){
        N head = new N(1);
        head.next = new N(2);
        head.next.next = new N(3);
        Scanner sc = new Scanner(System.in);
        printLinkedList(head);
        // head = insertAtBeginning(head, sc);
        // printLinkedList(head);
        // head = insertAtend(head, sc);
        // printLinkedList(head);
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // head = inserAtParticularPosition(head, sc);
        // printLinkedList(head);
        head = deleteFirstNode(head);
        // printLinkedList(head);
            // head = deleteLastNode(head);
            // printLinkedList(head);
            System.out.println(searchInLinkedList(head, sc));
    }
    private static int searchInLinkedList(N head, Scanner sc) {
        System.out.println("Enter Element you want to search ?");
        int x = sc.nextInt();

        if(head==null) return -1;
        int pos = 0;
        N temp = head;
        while(temp!=null){
            pos++;
            if(x == temp.data) return pos;
            temp = temp.next;
        }
        return -1;
    }
       
    private static N deleteLastNode(N head) {
        if(head==null || head.next==null) return null;
        N temp = head;
        while(temp.next.next!=null ){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    private static N deleteFirstNode(N head) {
        if(head==null) return null;
       return head.next;
    }
    private static N inserAtParticularPosition(N head, Scanner sc) {
        System.out.println("Enter data you want to add ?");
        int newData = sc.nextInt();
        System.out.println("Enter position ?");
        int pos = sc.nextInt();
        N newNode = new N(newData);
        N temp = head;
        if(pos==1){
            newNode.next = head;
            return newNode;
        }
        for(int i=1; i<=pos-2; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
        
    }
    private static N insertAtend(N head, Scanner sc) {
        System.out.println("Enter data you want to add at end ?");
        int newData = sc.nextInt();
        N newNode = new N(newData);
        if(head==null){
            return newNode;
        }
        N temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
}
