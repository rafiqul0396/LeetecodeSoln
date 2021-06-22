package juneleetcodeProblem.Tree;

//import org.graalvm.compiler.graph.Node;
//Node class in the tree 
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

public class BinaryTree {

    Node root;

    // printing the noes in the tree
    public void print(Node root) {
        if (root == null) {
            return;

        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.print(tree.root);

    }

}
