package workshop6.tree;

import java.util.*;

class GFG_Count_Leaf_Iterative
{
    /* A binary tree Node has data,
    pointer to left child and
    a pointer to right child */
    static class Node
    {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left=this.right=null;
        }
    }

    /* Function to get the count of
    leaf Nodes in a binary tree*/
    static int getLeafCount(Node node)
    {
        // If tree is empty
        if (node == null)
        {
            return 0;
        }

        // Initialize empty queue.
        Queue<Node> q = new LinkedList<>();

        // Do level order traversal starting from root
        int count = 0; // Initialize count of leaves
        q.add(node);
        while (!q.isEmpty())
        {
            Node temp = q.poll();
            ;

            if (temp.left != null)
            {
                q.add(temp.left);
            }
            if (temp.right != null)
            {
                q.add(temp.right);
            }
            if (temp.left == null &&
                    temp.right == null)
            {
                count++;
            }
        }
        return count;
    }
//    static Node newNode(int data)
//    {
//        Node node = new Node();
//        node.data = data;
//        node.left = node.right = null;
//        return (node);
//    }

    // Driver Code
    public static void main(String[] args)
    {
        {
            /*   1
                / \
               2   3
              / \
             4   5
            Let us create Binary Tree shown in
            above example */
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.left.left.left = new Node(45);
            root.left.left.right = new Node(44);

            /* get leaf count of the above created tree */
            System.out.println(getLeafCount(root));
        }
    }
}
