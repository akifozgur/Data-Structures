package Binary_SearchTree;

public class Main {

	public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        

        tree.insert(50);
        tree.insert(17);
        tree.insert(72);
        tree.insert(12);
        tree.insert(23);
        tree.insert(9);
        tree.insert(14);
        tree.insert(19);
        tree.insert(54);
        tree.insert(76);
        tree.insert(67);
        
        System.out.println("\nInorder Traversal:");
        tree.inordertraversal(tree.root);
        tree.delete(50);
        tree.delete(51);
        System.out.println("\nInorder Traversal:");
        tree.inordertraversal(tree.root);
        tree.search(67);
        tree.search(68);

    }
}
