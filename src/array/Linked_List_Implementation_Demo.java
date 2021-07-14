//package array;
//
//
//
//class Node {
//    Node next;
//    int data;
//}
//
//public class Linked_List_Implementation_Demo {
//    public static void main(String[] args) {
//        Linked_List_Demo list = new Linked_List_Demo();
//        list.insert(9);
//        list.insert(94);
//        list.insert(7);
//        list.insert(52);
//        list.show();
//        System.out.println();
//        list.remove(2);
//        list.show();
//
//    }
//
//}
//
//class Linked_List_Demo{
//    Node head;
//    public void insert(int num){
//
//        Node node_demo = new Node();
//        node_demo.data = num;
//        node_demo.next=null;
//        if (head==null){
//            head =node_demo;
//        }
//        else{
//            Node n = head;
//            while(n.next!=null){
//                n=n.next;
//            }
//            n.next=node_demo;
//
//        }
//    }
//
//    public void remove(int pos){
//    Node node = head;
//        for (int i = 1; i <pos-1 ; i++) {
//            node =node.next;
//        }
//        node.next = (node.next).next;
//
//    }
//
//    public void show(){
//        Node node = head;
//        while(node.next!=null){
//            System.out.println(node.data);
//            node=node.next;
//        }
//        System.out.println(node.data);
//    }
//}
