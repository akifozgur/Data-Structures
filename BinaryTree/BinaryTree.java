package BinaryTree;

public class BinaryTree {
    // Root of Binary Tree
    Node root;

    BinaryTree() {
        root = null;
    }

    void postorder(Node node) {
        if (node == null)
            return;

        // Traverse left
        postorder(node.leftChild);
        // Traverse right
        postorder(node.rightChild);
        // Traverse root
        System.out.print(node.data + "->");
    }

    void inorder(Node node) {
        if (node == null)
            return;

        // Traverse left
        inorder(node.leftChild);
        // Traverse root
        System.out.print(node.data + "->");
        // Traverse right
        inorder(node.rightChild);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // Traverse root
        System.out.print(node.data + "->");
        // Traverse left
        preorder(node.leftChild);
        // Traverse right
        preorder(node.rightChild);
    }
}
