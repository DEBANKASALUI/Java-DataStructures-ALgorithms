package BinarySearchTree.bst;

public class BSTMain {
    public static void main(String[] args) {

        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(80);

//        Traversal
        System.out.println("Inorder traversal:");
        tree.inOrder(tree.root);

        System.out.println();
        System.out.println("PostOrder traversal:");
        tree.postOrder(tree.root);

        System.out.println();
        System.out.println("PreOrder traversal:");
        tree.preOrder(tree.root);

//        Deletion
        System.out.println();
        System.out.println("Deleting 80:");
        tree.delete(80);
        tree.inOrder(tree.root);

//        Insertion
        System.out.println();
        System.out.println("Inserting 100:");
        tree.insert(100);
        tree.inOrder(tree.root);

//      Search
        System.out.println();
        System.out.println("Searching 100:");
        System.out.println("Found 100: "+tree.search(100));
//        boolean search = tree.search(100);
//        if(search){
//            System.out.println("Value present in BST");
//        }else{
//            System.out.println("Value not present in BST");
//        }
    }
}
