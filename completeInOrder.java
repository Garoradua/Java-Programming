class Node{
    int data;
    Node left, right;

    Node(int key){
        this.data = key;
        left= right = null;
    }
}
public class completeInOrder{
     static Node root;

    public static void main(String args[]){
        completeInOrder tree = new completeInOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right  = new Node(4);

        printInorder(root);
    }

    public static void printInorder(Node root) {
        if(root==null) return;
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }
}