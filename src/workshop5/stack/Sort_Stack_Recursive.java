package workshop5.stack;
import java.util.Scanner;
import java.util.Stack;

    class Sort_Stack_Recursive{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                Stack<Integer> s=new Stack<>();
                int n=sc.nextInt();
                while(n-->0)
                    s.push(sc.nextInt());
                Sort_Stack_Recursive_gfg g=new Sort_Stack_Recursive_gfg();
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
    class Sort_Stack_Recursive_gfg{
        public Stack<Integer> sort(Stack<Integer> s)
        {
            if(!s.empty()){
               int x =  s.pop();
                sort(s);
                sort_Stack(s,x);
            }
            return s;
        }
// Always try to limit the the number of statement below recursive call
        public void sort_Stack(Stack<Integer> s, int x){

            if (s.isEmpty() || s.peek()<x){
                s.push(x);
                return;
            }

           int tmp =  s.pop();
            sort_Stack(s,x);
            s.push(tmp);

        }
    }
