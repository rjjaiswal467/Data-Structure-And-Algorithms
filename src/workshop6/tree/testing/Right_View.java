package workshop6.tree.testing;

class Max_level {

    int max_level;
}

class Right_View {

//    Node root;
//    Max_level max = new Max_level();

    // Recursive function to print right view of a binary tree.
    void rightViewUtil(Node node, int level, Max_level max_level) {

        // Base Case
        if (node == null)
            return;

        // If this is the last Node of its level

        if (max_level.max_level < level) {
            System.out.print(node.key + " ");
            max_level.max_level = level;
        }

        rightViewUtil(node.right, level + 1, max_level);
        rightViewUtil(node.left, level + 1, max_level);
    }

//    void rightView()
//    {
//        rightView(root);
//    }

    // A wrapper over rightViewUtil()
//    void rightView(Node node) {
//
//        rightViewUtil(node, 1, max);
//    }

    // Driver program to test the above functions
    public static void main(String args[]) {
        Right_View tree = new Right_View();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.left.left.left = new Node(9);

        Max_level max = new Max_level();
        tree.rightViewUtil(root, 1, max);
//        tree.rightView(tree.root);

    }
}