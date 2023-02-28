package Binary_SearchTree;

public class BinarySearchTree {
  Node root;
  public BinarySearchTree() {
    root = null;
  }

  // print the nodes value by using the inorder traversal
  public void inordertraversal(Node troot) {
    if (troot != null) {
      inordertraversal(troot.leftChild);
      System.out.print(" " + troot.data);
      inordertraversal(troot.rightChild);
    }
  }

  public void search(int value) {
    Node current = root;
    while (current.data != value) {
      if (value < current.data) {
        current = current.leftChild;
      } else {
        current = current.rightChild;
      }
      if (current == null) {
        System.out.printf("\nSearch Operation: Value %d is not found in the tree.",value);
        break;
      }
    }
    if (current != null){
      System.out.printf("\nSearch Operation: Value %d is found in the tree.",value);
    }
  }


  public void delete(int value) {

    // first search the value which you want to delete and write delete cases
    Node current = root;
    Node parent = root;
    boolean isleftChild = false;
    while (current.data != value) {
      parent = current;
      if (value < current.data) {

        current = current.leftChild;
        isleftChild = true;
      } else {

        current = current.rightChild;
        isleftChild = false;
      }
      if (current == null) {
        System.out.printf("\nDeletion Operation: Value %d is not found in the tree.",value);
        return;
      }
    }


    // Leaf node deletion case
    if (current.leftChild == null && current.rightChild == null) {
      if (current == root) {
        root = null;
      } else if (isleftChild == true) {
        parent.leftChild = null;
      } else {
        parent.rightChild = null;
      }
    }


    // Node to be deleted has one child case
    // Node to be deleted has right child
    else if (current.leftChild == null) {
      if (current == root) {
        root = current.rightChild;
      } else if (isleftChild) {
        parent.leftChild = current.rightChild;
      } else {
        parent.rightChild = current.rightChild;
      }
    }
    // Node to be deleted has leftChild child
    else if (current.rightChild == null) {
      if (current == root) {
        root = current.leftChild;
      }
      else if (isleftChild) {
        parent.leftChild = current.leftChild;
      }
      else {
        parent.rightChild = current.leftChild;
      }
    }


    // Node to be deleted has two children case
    else {
      Node successor = successor(current);
      if (current == root) {
        root = successor;
      } else if (isleftChild) {
        parent.leftChild = successor;
      } else {
        parent.rightChild = successor;
      }
      successor.leftChild = current.leftChild;
    }
    System.out.printf("\nDeletion Operation: Value %d deleted from the tree.",value);
  }

  public Node successor(Node node) {
    Node successor = node;
    Node successorParent = node;
    Node current = node.rightChild;
    while (current != null) {
      successorParent = successor;
      successor = current;
      current = current.leftChild;
    }
    if (successor != node.rightChild) {
      successorParent.leftChild = successor.rightChild;

      successor.rightChild = node.rightChild;
    }
    return successor;
  }


  public void insert(int value) {
    Node newnode = new Node(value);
    newnode.data = value;
    if (root == null) {
      root = newnode;
    } else {
      Node current = root;
      Node parent = null;
      while (true) {
        parent = current;
        if (value < current.data) {
          current = current.leftChild;
          if (current == null) {
            parent.leftChild = newnode;
            break;
          }
        } else {
          current = current.rightChild;
          if (current == null) {
            parent.rightChild = newnode;
            break;
          }
        }
      }
    }
    System.out.printf("\nInsertion Operation: Value %d inserted to the tree.",value);
  }
}

