package juneleetcodeProblem.Tree;

public class maxElementBT {
    Node root;

    public int maxElemenet(Node root) {
        int root_val, left, right, max = Integer.MIN_VALUE;
        if (root != null) {
            root_val = root.data;
            left = maxElemenet(root.left);
            right = maxElemenet(root.right);

            if (left > right) {
                max = left;
            } else {

                max = right;
            }
            if (root_val > max) {
                max = root_val;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        maxElementBT tree = new maxElementBT();
        tree.root = new Node(3);
        tree.root.left = new Node(27);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5000);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);
        System.out.println(tree.maxElemenet(tree.root));
    }

}
