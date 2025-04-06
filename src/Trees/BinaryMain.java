package Trees;

public class BinaryMain {
    public static void main(String[] args) {

//        Creating Root Node
        Node root = new Node(1);

//        Creating Left child of Root
        Node left = new Node(2);

//        Creating Right child of Root
        Node right = new Node(3);

//        Creating Binary Tree
        BinaryTree binaryTree = new BinaryTree(root);

//        Setting Left and Right Child Nodes
        binaryTree.root.left = left;
        binaryTree.root.right = right;

//        Adding child Nodes to Left Subtree
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        binaryTree.root.left.left = node4;
        binaryTree.root.left.right = node5;

//        Adding child Nodes to Right Subtree
        Node node6 = new Node(6);
        binaryTree.root.right.right = node6;

//        Traversal:
//        Pre-Order(Depth-First-Search)Traversal:Root->Left->Right
        System.out.println("Pre-Order:");
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
//        In-Order(Depth-First-Search)Traversal:Left->Root->Right
        System.out.println("In-Order:");
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
//        Post-Order(Depth-First-Search)Traversal:Left->Right->Root
        System.out.println("Post-Order:");
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
//        Level Order Traversal->Level by Level(Breadth-First-Search)

    }
}
