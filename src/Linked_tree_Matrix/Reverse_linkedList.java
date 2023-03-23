package Linked_tree_Matrix;

class NodeLL {
    int data;
    NodeLL next;
    NodeLL(int data){
        this.data = data;
        next = null;
    }
}

public class Reverse_linkedList {

    static NodeLL reverse(NodeLL head){
        if(head==null || head.next==null){
            return head;
        }
        NodeLL next;
        NodeLL current = head;
        NodeLL prev = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static void print(NodeLL node){
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }

    }

    public static void main(String[] args) {
        NodeLL head;
        head = new NodeLL(5);
        head.next = new NodeLL(10);
        head.next.next = new NodeLL(15);
        head.next.next.next = new NodeLL(20);
        head.next.next.next.next = new NodeLL(30);
        head.next.next.next.next.next = new NodeLL(40);
        print(reverse(head));
    }

}
