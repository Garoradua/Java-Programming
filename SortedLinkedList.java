import java.util.Scanner;

class SNode{
    int data;
    SNode next;

    SNode(int data){
        this.data = data;
        next = null;
    }
}


public class SortedLinkedList {
    public static void main(String[] args){
        SNode head = new SNode(10);
        head.next = new SNode(20);
        head.next.next = new SNode(30);
        head.next.next.next = new SNode(40);
        head.next.next.next.next = new SNode(50);
        printLinkedList(head);
        Scanner sc = new Scanner(System.in);
        // System.out.println();
        // head = insertAtSortedWay(head, sc);
        System.out.println();
        // printLinkedList(head);
        // int data = findMiddle(head);
        // System.out.println(data);
        // int data = NthfromEnd(head, sc);
        // System.out.println(data);
        // int data = NthfromEndFromTwoPointer (head, sc);
        // System.out.println(data);
        head = reverseLinkedList(head);
        printLinkedList(head);
    }

    private static SNode reverseLinkedList(SNode head) {
        if(head==null) return null;
        SNode prev = null;
        SNode curr = head;
        SNode agla = null;
        while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }

    private static int NthfromEndFromTwoPointer(SNode head, Scanner sc) {
        if(head==null) return -1;
        int k = sc.nextInt();
        SNode firstPointer = head;
        SNode secondPointer = head;
        for(int i=1; i<=k; i++){
            if(secondPointer==null) return -1;
            secondPointer = secondPointer.next;
        }
        while(secondPointer!=null){
            secondPointer = secondPointer.next;
            firstPointer = firstPointer.next;
        }
        if(firstPointer==null) return -1;
        return firstPointer.data;

    }

    private static int NthfromEnd(SNode head, Scanner sc) {
        if(head==null) return -1;
        int k = sc.nextInt();
        int length = 0;
        SNode temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        if(k>length) return -1;
        int pos = length-k+1;
        temp = head;
        for(int i=1; i<pos; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    private static int findMiddle(SNode head) {
        if(head==null) return -1;
        SNode slowpointer = head;
        SNode fastpointer = head;
        while(fastpointer!=null && fastpointer.next!=null){
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;
        }
        return slowpointer.data;
    }

    private static SNode insertAtSortedWay(SNode head, Scanner sc) {
        int data = sc.nextInt();
        SNode newnode = new SNode(data);
        if(head==null) return newnode;
        if(data < head.data){
            newnode.next = head;
            return newnode;
        }
        SNode curr = head;
        while(curr.next!=null && curr.next.data < data){
            curr = curr.next;
        }
        newnode.next = curr.next;
        curr.next = newnode;
        return head;
    }

    private static void printLinkedList(SNode head) {
        if(head==null) return;
        SNode temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
