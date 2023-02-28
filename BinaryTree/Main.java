package BinaryTree;


public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(7);
        tree.root.rightChild = new Node(9);
        tree.root.leftChild.leftChild = new Node(2);
        tree.root.leftChild.rightChild = new Node(6);
        tree.root.leftChild.rightChild.leftChild = new Node(5);
        tree.root.leftChild.rightChild.rightChild = new Node(11);
        tree.root.rightChild.rightChild = new Node(9);
        tree.root.rightChild.rightChild.leftChild = new Node(5);
      
        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);
        System.out.println("\nPreorder traversal:");
        tree.preorder(tree.root);
    }
}
