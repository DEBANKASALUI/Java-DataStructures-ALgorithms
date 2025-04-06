package Trees;

public class Node {
    int data;
//    For Binary Tree -having at most 2 children
    Node left, right;

//    For General Tree - having more than 2 children
//    List<Node> children;

    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
