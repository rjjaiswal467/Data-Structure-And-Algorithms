package workshop5.stack;

import java.util.Scanner;
import java.util.Stack;

class SortedStack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Stack<Integer> s=new Stack<>();
            int n=sc.nextInt();
            while(n-->0)
                s.push(sc.nextInt());
            GfG_Sort_A_Stack g=new GfG_Sort_A_Stack();
            Stack<Integer> a=g.sort(s);
            while(!a.empty()){
                System.out.print(a.peek()+" ");
                a.pop();
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


/*Complete the function below*/
class GfG_Sort_A_Stack{
    public Stack<Integer> sort(Stack<Integer> s)
    {
        Stack<Integer> tempStack = new Stack<>(); //Sorting using Auxillary stack

        while(!s.isEmpty()) {
           int tmp = s.pop();

            while (!tempStack.isEmpty() && tempStack.peek()>tmp) {
                s.push(tempStack.pop());
            }
            tempStack.push(tmp);
        }
        return tempStack;
    }
}