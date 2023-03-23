package Linked_tree_Matrix;

class NodeTree{
    int data;
    NodeTree right,left;

    NodeTree(int data){
        this.data = data;
        right=left=null;
    }
}

public class TreeTraversal {
    NodeTree root;

    TreeTraversal(){
        root = null;
    }
    int count=0;

    public void printPreOrder(NodeTree nodeTree){
        if(nodeTree==null)
            return;
        System.out.print(nodeTree.data);
        printPreOrder(nodeTree.left);
        printPreOrder(nodeTree.right);
    }

    public int returnCount(NodeTree nodeTree){
        countNumberOfNodes(nodeTree);
        return count;
    }
    public void countNumberOfNodes(NodeTree nodeTree){

        if(nodeTree==null) {
            return;
        }
        countNumberOfNodes(nodeTree.left);
        countNumberOfNodes(nodeTree.right);
        if(nodeTree!=null)
        count++;
    }

    public static void main(String[] args) {
            TreeTraversal treeTraversal = new TreeTraversal();
            treeTraversal.root = new NodeTree(1);
        treeTraversal.root.left = new NodeTree(2);
        treeTraversal.root.right = new NodeTree(3);
        treeTraversal.root.left.left = new NodeTree(4);
        treeTraversal.root.left.right = new NodeTree(5);
        treeTraversal.root.left.right.left = new NodeTree(61);
        treeTraversal.root.right.right = new NodeTree(7);

        treeTraversal.printPreOrder(treeTraversal.root);
        System.out.println();
        System.out.println(treeTraversal.returnCount(treeTraversal.root));
    }
}
