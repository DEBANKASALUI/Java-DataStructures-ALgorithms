package BinarySearchTree.bst;

public class BST {
    Node root;

    public BST() {
        this.root = null;
    }

    //    Insert method
    private Node insert(Node root, int data) {
        if (root == null) {
            Node node = new Node(data);
            return node;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void insert(int data) {
        root = this.insert(root, data);
    }

    //    Delete Method
    private Node delete(Node root, int data) {

    }

    public void delete(int data) {
        root = this.delete(root, data);
    }
}
