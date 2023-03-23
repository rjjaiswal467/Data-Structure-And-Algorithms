package workshop6.tree;



public class Find_Leaf_Nodes {
    Node root;
    Find_Leaf_Nodes(){
        root = null;
    }

    public void count_Leaf(Node node){
        if(node==null)
            return;
        count_Leaf(node.left);
        count_Leaf(node.right);
        if(node.right==null && node.left==null) {
            System.out.println(node.key);
        }
    }


    public static void main(String[] args) {
        Find_Leaf_Nodes tree = new Find_Leaf_Nodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(9);
        tree.root.right.left = new Node(10);

        tree.count_Leaf(tree.root);

    }
}
