package AVL_Tree;

public class Node {
    int data;
    int height;
    Node leftChild;
    Node rightChild;

    public Node(int data)
    {
        this.data = data;
        this.height = 1;
        this.leftChild = null;
        this.rightChild = null;
    }
}
