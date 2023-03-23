package Linked_tree_Matrix;

public class LL {

//     Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    int frequency(Node node,int search_For){
        int count =0;
        while(node!=null){
            if(node.data==search_For){
                count++;
            }
            node = node.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LL list = new LL();
        Node head;
        head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(3);
        System.out.print("present linked list is: ");


        list.printList(head);
        int search=3;
        System.out.println();
        System.out.println("Count for "+search+ " is: "+list.frequency(head,search));
    }
}
