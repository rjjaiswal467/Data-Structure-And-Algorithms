package Linked_tree_Matrix;


class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        next = null;
    }
}
public class RemoveNodeLinkedList {

    static Node1 remove(Node1 head,int number){

        Node1 tmp = head;
        while(head!=null){
            if(head.next.data==number){
                head.next=head.next.next;
                break;
            }else {
                head = head.next;
            }
        }

        return tmp;
    }
    static void print(Node1 node){

        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node1 node1;
        node1 = new Node1(1);
        node1.next = new Node1(2);
        node1.next.next = new Node1(3);
        node1.next.next.next = new Node1(10);
        node1.next.next.next.next = new Node1(4);
        node1.next.next.next.next.next = new Node1(5);
        print(remove(node1,10));
    }
}
