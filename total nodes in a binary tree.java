int count = 0;
countNode(Node root){
    if(root==null) return 0;
    return 1+countNode(root.left)+countNode(root.right);
}