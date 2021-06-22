package juneleetcodeProblem.Tree.treeTRaversal;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int item) {
        this.data = item;
        this.left = null;
        this.right = null;

    }

}

public class Inorder {
    Node root;

    public void printInorder(Node root) {
        if (root == null)
            return;

        /* first recur on left child */
        printInorder(root.left);

        /* then print the data of node */
        System.out.print(root.data + " ");

        /* now recur on right child */
        printInorder(root.right);
    }

    public void printPreorder(Node root) {
        if (root == null) {
            return;

        }
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public void PrintpostOrder(Node root) {
        if (root == null) {
            return;

        }
        PrintpostOrder(root.left);
        PrintpostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Inorder tree = new Inorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root);

        System.out.println("\nPreorder traversal of binary tree is ");
        tree.printPreorder(tree.root);

        System.out.println("\npostorder traversal of binary tree is ");
        tree.PrintpostOrder(tree.root);

    }

}
