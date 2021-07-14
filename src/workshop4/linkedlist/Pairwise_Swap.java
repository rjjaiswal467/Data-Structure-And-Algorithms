package workshop4.linkedlist;

// { Driver Code Starts
import java.util.*;
        import java.io.*;

 class Node3{
    int data;
    Node3 next;

    Node3(int x){
        data = x;
        next = null;
    }

}
class Pairwise_Swap{
    static void printList(Node3 node)
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

            Node3 head = new Node3(sc.nextInt());
            Node3 tail = head;
            HashMap<Node3, Integer> mp = new HashMap<Node3, Integer>();
            mp.put(head, head.data);
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node3(sc.nextInt());
                tail = tail.next;
                mp.put(tail, tail.data);
            }

            Node3 failure = new Node3(-1);

            Solution_Pairwise_Swap g = new Solution_Pairwise_Swap();
            head = g.pairwiseSwap(head);

            Node3 temp = head;
            int f = 0;
            while (temp != null)
            {
                if(mp.get(temp) != temp.data){
                    f = 1;
                }
                temp = temp.next;
            }

                printList(head);

            t--;
        }
    }
}

// } Driver Code Ends


/* node class of the linked list

class Node3
{
    int data;
    Node3 next;
    Node3(int key)
    {
        data = key;
        next = null;
    }
}

*/


class Solution_Pairwise_Swap {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node3 pairwiseSwap1(Node3 head)
    {
        int tmp=0;
        Node3 current=head;
        while(current!=null && current.next!=null){
            tmp= current.data;
            current.data = current.next.data;
            current.next.data=tmp;
            current=current.next.next;
        }
        return head;
    }

    public Node3 pairwiseSwap(Node3 head)
    {
        if (head==null) return head;

        Node3 current = head.next;
        Node3 left=head;
        Node3 tmp;
        while(current!=null && current.next.next!=null){

        }
        return head;
    }
}