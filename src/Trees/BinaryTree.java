package Trees;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
    }

//    Binary Tree Operations:

//        Traversal:
//        Pre-Order(Depth-First-Search)Traversal:Root->Left->Right
    public void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + "\t");
        preOrder(node.left);
        preOrder(node.right);

    }

//            In-Order(Depth-First-Search)Traversal:Left->Root->Right
    public void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + "\t");
        inOrder(node.right);

    }

//        Post-Order(Depth-First-Search)Traversal:Left->Right->Root
    public void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "\t");
    }

//        Level Order Traversal->Level by Level(Breadth-First-Search)

}
