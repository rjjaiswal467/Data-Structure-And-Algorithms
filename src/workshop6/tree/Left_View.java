package workshop6.tree;


class Max_Level{
    int max_level;
}
public class Left_View {



    public static void get_left_view(Node root, int level,Max_Level max_level){

        if (root==null)
            return;
        if (level > max_level.max_level){
            System.out.print(root.key+" ");
            max_level.max_level=level;
        }
        get_left_view(root.left,level+1,max_level);
        get_left_view(root.right,level+1,max_level);
    }


    public static void main(String[] args) {
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.left.left = new Node(9);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
        root.right.right = new Node(8);
        root.right.right.left = new Node(10);

        Max_Level max_level = new Max_Level();

        Left_View.get_left_view(root,1,max_level);

    }
}

//                             1
//                        2         3
//                     4     5    6    8
//                  9                10

