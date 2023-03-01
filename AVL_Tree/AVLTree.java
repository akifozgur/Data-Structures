package AVL_Tree;

import java.util.Stack;

public class AVLTree
{
    Node Root;


    int getHeight(Node key)
    {
        if (key == null)
           return 0;

        else
            return key.height;
    }


    int getBalance(Node key)
    {
        if (key == null)
           return 0;

        else
            return (getHeight(key.rightChild) - getHeight(key.leftChild));
    }


    void updateHeight(Node key)
    {
        int leftChildSubtreeHeight = getHeight(key.leftChild);
        int rightChildSubtreeHeight = getHeight(key.rightChild);

        key.height = Math.max(leftChildSubtreeHeight , rightChildSubtreeHeight) + 1;
    }


    Node rotateleftChild(Node oldRoot)
    {
        Node newRoot = oldRoot.rightChild;
        Node temp = newRoot.leftChild;

        newRoot.leftChild = oldRoot;
        oldRoot.rightChild = temp;

        updateHeight(oldRoot);
        updateHeight(newRoot);

        return newRoot;
    }



    Node rotaterightChild(Node oldRoot)
    {
        Node newRoot = oldRoot.leftChild;
        Node temp = newRoot.rightChild;

        newRoot.rightChild = oldRoot;
        oldRoot.leftChild = temp;

        updateHeight(oldRoot);
        updateHeight(newRoot);

        return newRoot;
    }


    Node balanceTree(Node root)
    {
        updateHeight(root);

        int balance = getBalance(root);

        if (balance == 2)
        {
            if (getBalance(root.rightChild) < 0)
                root.rightChild = rotaterightChild(root.rightChild);

            return rotateleftChild(root);
        }

        if (balance == -2)
        {
            if (getBalance(root.leftChild) > 0)
                root.leftChild = rotateleftChild(root.leftChild);

            return rotaterightChild(root);
        }

        return root;
    }


    Node insertNode(Node root, int key)
    {
        if (root == null)
            return new Node(key);

        else if (key<root.data)
            root.leftChild = insertNode(root.leftChild, key);

        else
            root.rightChild = insertNode(root.rightChild, key);

        return balanceTree(root);
    }


    Node findSuccessor(Node root)
    {
        if (root.leftChild != null)
            return findSuccessor(root.leftChild);

        else
            return root;
    }


    Node removeNode(Node root, int key)
    {
        if (root == null)
            return root;

        else if (key<root.data)
            root.leftChild = removeNode(root.leftChild, key);

        else if (key>root.data)
            root.rightChild = removeNode(root.rightChild, key);

        else
        {
            if (root.rightChild == null)
                root = root.leftChild;

            else if (root.leftChild == null)
                root = root.rightChild;

            else
            {
                Node temp = findSuccessor(root.rightChild);
                root.data = temp.data;
                root.rightChild = removeNode(root.rightChild, root.data);
            }
        }

        if (root == null)
            return root;

        else
            return balanceTree(root);
    }


    Node search(Node root, int key)
    {
        if (root == null || key==root.data)
            return root;

        if (key<root.data)
            return search(root.leftChild, key);

        else
            return search(root.rightChild, key);
    }


    void add(int key)
    {
        if (search(Root , key) == null)
        {
            Root = insertNode(Root , key);
            System.out.println("\n" + key + " added successfully.");
        }

        else
            System.out.println("\n" + key + " has been added.");
    }


    void delete(int key)
    {
        if (search(Root , key) != null)
        {
            Root = removeNode(Root , key);
            System.out.println("\n" + key + " deleted successfully.");
        }

        else
            System.out.println("\n" + key + " not found in AVL Tree.");
    }

    int depth(int key)
    {
        Node temp = search(Root, key);

        if (temp == null)
            return -1;

        else
        {
            System.out.println("\n" + "The depth of " + key + " is : " + (Root.height - temp.height));
            return (Root.height - temp.height);
        }
    }

    void showingPreOrder(Node key)
    {
        System.out.print("\nPre-Order : ");
        Stack <Node> stack = new Stack <Node>();

        if (key == null)
            return;

        else
        {
            stack.push(key);

            while (!stack.empty())
            {
                key = stack.pop();
                System.out.print(key.data + " ");

                if (key.rightChild != null)
                    stack.push(key.rightChild);

                if (key.leftChild != null)
                    stack.push(key.leftChild);
            }
        }

        System.out.println();
    }

    void showingInOrder(Node key)
    {
        System.out.print("\nIn-Order  : ");
        Stack <Node> stack = new Stack <Node>();

        while (!stack.empty() || key != null)
        {
            if (key != null)
            {
                stack.push(key);
                key = key.leftChild;
            }

            else
            {
                key = stack.pop();
                System.out.print(key.data + " ");
                key = key.rightChild;
            }
        }

        System.out.println();
    }



    public void TreePrinter() {
        int h = height(Root);
        int col = getcol(h);
        int[][] M = new int[h][col];
        printTree(M, Root, col / 2, 0, h);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 0)
                    System.out.print("  ");
                else
                    System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void printTree(int[][] M, Node root, int col, int row, int height) {
        if (root == null)
            return;
        M[row][col] = root.data;
        printTree(M, root.leftChild, col - (int)Math.pow(2, height - 2), row + 1, height - 1);
        printTree(M, root.rightChild, col + (int)Math.pow(2, height - 2), row + 1, height - 1);
    }
    
    public static int height(Node root) {
        if (root == null)
            return 0;
        return Math.max(height(root.leftChild), height(root.rightChild)) + 1;
    }
    
    public static int getcol(int h) {
        if (h == 1)
            return 1;
        return getcol(h - 1) + getcol(h - 1) + 1;
    }
}