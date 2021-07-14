package workshop4.linkedlist;

import java.util.*;

class Node4 {
    int data;
    Node4 next;

    Node4(int d) {
        data = d;
        next = null;
    }
}

class Add_Two_Numbers_Using_Linked_Lists{

    static void printList(Node4 n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();
            int val = sc.nextInt();

            Node4 first = new Node4(val);
            Node4 tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node4(val);
                tail = tail.next;
            }

            int m = sc.nextInt();
            val = sc.nextInt();

            Node4 second = new Node4(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node4(val);
                tail = tail.next;
            }

            Solution_Add_Two_Numbers_Using_Linked_Lists g = new Solution_Add_Two_Numbers_Using_Linked_Lists();
            Node4 res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node4 {
    int data;
    Node4 next;

    Node4(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution_Add_Two_Numbers_Using_Linked_Lists{
    static Node4 addTwoLists(Node4 first, Node4 second){
        // return head of sum list
        Node4 result = null;

        return result;
    }
}
