package AVL_Tree;

public class Main {
    public static void main(String[] args)
    {
        AVLTree tree = new AVLTree();

        tree.add(59);
        tree.add(37);
        tree.add(67);
        tree.add(23);
        tree.add(55);
        tree.add(78);
        tree.add(17);
        System.out.println();
        tree.showingInOrder(tree.Root);

        System.out.println();
        tree.TreePrinter();

        tree.add(21);
        System.out.println();
        tree.showingInOrder(tree.Root);

        System.out.println();
        tree.TreePrinter();

        tree.delete(37);
        System.out.println();
        tree.showingInOrder(tree.Root);
        System.out.println();
        tree.showingInOrder(tree.Root);

        System.out.println();
        tree.TreePrinter();
    }
}
