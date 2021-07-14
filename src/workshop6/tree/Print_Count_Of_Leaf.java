package workshop6.tree;



public class Print_Count_Of_Leaf {
    Node root;
    Print_Count_Of_Leaf(){
        root = null;
    }
    int count=0;
    public int count_Leaf(Node node){
        inorder(node);
        return count;
    }
    public void inorder(Node node){
        if (node == null)
            return;
        inorder(node.left);
        inorder(node.right);
        if(node.right==null && node.left==null){
            count++;
        }
    }


    public static void main(String[] args) {
        Print_Count_Of_Leaf tree = new Print_Count_Of_Leaf();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(9);
//        tree.root.right.left = new Node(10);

        System.out.println(tree.count_Leaf(tree.root));
    }
}
