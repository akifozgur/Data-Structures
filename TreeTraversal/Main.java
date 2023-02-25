package TreeTraversal;

public class Main {
    public static void main(String[] args) {
        TreeTraversal_BinaryTree tree = new TreeTraversal_BinaryTree();
        tree.root = new Node("A");
        tree.root.leftChild = new Node("B");
        tree.root.rightChild = new Node("C");
        tree.root.leftChild.leftChild = new Node("D");
        tree.root.leftChild.rightChild = new Node("E");
        tree.root.rightChild.leftChild = new Node("F");
        tree.root.rightChild.rightChild = new Node("G");
      
        System.out.println("Inorder traversal");
        tree.inorder(tree.root);
      
        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);
      
        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
        }
}
