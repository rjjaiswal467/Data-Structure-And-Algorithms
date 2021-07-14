package workshop4.linkedlist;

import java.util.LinkedList;

class Node{
    int data; Node next;
}
public class Linked_List_Implemntation {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.insert(12);list.insert(2);list.insert(10);list.insert(28);list.show();
    }
}
class Linked_List{
    Node head;//refer to 1st node
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null){
            head=node;
        }
        else {
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}

