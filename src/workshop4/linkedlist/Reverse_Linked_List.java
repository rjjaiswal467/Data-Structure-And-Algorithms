package workshop4.linkedlist;

// { Driver Code Starts
import java.util.*;
        import java.io.*;

class Node1{
    int data;
    Node1 next;

    Node1(int x){
        data = x;
        next = null;
    }

}
class Reverse_Linked_List{
    static void printList(Node1 node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){

            int n = sc.nextInt();

            Node1 head = new Node1(sc.nextInt());
            Node1 tail = head;

            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node1(sc.nextInt());
                tail = tail.next;
            }

            Solution_Reverse_Linked_List ob = new Solution_Reverse_Linked_List();
            head = ob.reverseList(head);
            printList(head);
            t--;
        }
    }
}
class Solution_Reverse_Linked_List
{
    Node1 reverseList(Node1 head)
    {
        if (head==null || head.next==null)
            return head;
        //ncpc
        Node1 next;
        Node1 current = head;
        Node1 prev = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current=next;
        }
        return prev;
    }
}

