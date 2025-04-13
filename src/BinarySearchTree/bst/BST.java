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
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
//            Case 1: Node with no Children(Leaf Node)
            if (root.left == null && root.right == null) {
                return null;
            }
//            Case 2: Node with 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
//            Case 3: Node with 2 Children
            else {
                Node successor = findMin(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }

        }
        return root;
    }

    public Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void delete(int data) {
        root = this.delete(root, data);
    }

    //    Search Method
    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        return data < root.data ? search(root.left, data) : search(root.right, data);
    }

    public boolean search(int data) {
        return search(root, data);
    }

    //    Traversal:
//    Pre-Order(Depth-First-Search)Traversal:Root->Left->Right
    public void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + "\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    //    In-Order(Depth-First-Search)Traversal:Left->Root->Right
    public void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + "\t");
        inOrder(node.right);
    }


    //    Post-Order(Depth-First-Search)Traversal:Left->Right->Root
    public void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "\t");
    }
}
