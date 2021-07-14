package workshop4.linkedlist;

import java.util.*;
import java.lang.*;

class Node2
{
    int data;
    Node2 next;
    Node2(int key)
    {
        data = key;
        next = null;
    }
}

class Occurrence
{
    static Node2 head;
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node2 head = new Node2(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node2(a));
            }

            int k = sc.nextInt();
            Interger_Count ob= new Interger_Count();
            System.out.println(ob.count(head, k));
        }
    }

    public static void addToTheLast(Node2 node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node2 temp = head;
            while(temp.next !=  null)
                temp = temp.next;
            temp.next = node;
        }
    }
}// } Driver Code Ends


/*node class of the linked list
class Node2
{
    int data;
    Node2 next;
    Node2(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Interger_Count
{
    public static int count(Node2 head, int search_for)
    {
        if (head==null){
            return 0;
        }
        int count=0;
        while(head!=null){
            if(head.data==search_for){
                count++;
            }
            head = head.next;
        }
        return count;
    }
}
