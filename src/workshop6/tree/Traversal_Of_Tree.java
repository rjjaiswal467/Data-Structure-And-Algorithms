package workshop6.tree;

public class Traversal_Of_Tree {

    Node root;
    Traversal_Of_Tree(){
        root=null;
    }

    public void printPostOrder(Node node){
        if (node==null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key+ " ");
    }

    public void printInOrder(Node node){
        if (node==null)
        return;
        printInOrder(node.left);
        System.out.print(node.key+ " ");
        printInOrder(node.right);
    }

    public void printPreOrder(Node node){
        if(node==null)
            return;
        System.out.print(node.key+ " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder(){
        printPostOrder(root);
    }

    void printInOrder(){
        printInOrder(root);
    }

    void printPreOrder(){
        printPreOrder(root);
    }

    public static void main(String[] args) {

        Traversal_Of_Tree bt = new Traversal_Of_Tree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        System.out.print("PreOrder - ");
        bt.printPreOrder();

        System.out.println();

        System.out.print("InOrder - ");
        bt.printInOrder();
        System.out.println();

        System.out.print("PostOrder - ");
        bt.printPostOrder();
        System.out.println();
    }

}
