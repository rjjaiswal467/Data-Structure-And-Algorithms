package workshop6.tree;

class Node {
    int key;
    Node right, left;

    Node(int item) {
        key = item;
        left = right = null;
    }
}
