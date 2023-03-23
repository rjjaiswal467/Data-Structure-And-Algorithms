package workshop5.stack;


import practice1.Question1;

import java.util.*;
import java.lang.*;

class Driverclass_Parenthesis_Check
{
    public static void main(String args[])
    {

        Question1 obj =new Question1();
                ;
        ;
        Scanner sc = new Scanner(System.in);

        //Reading total number of testcases
        int t= sc.nextInt();

        while(t-- >0)
        {
            //reading the string
            String st = sc.next();

            //calling ispar method of Paranthesis class
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Parenthesis_Check().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");

        }
    }
}// } Driver Code Ends





class Parenthesis_Check {
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        if (x.length()/2f%1==0.5){
            return false;
        }
        for (int i = 0; i < x.length(); i++) {
            char tmp = x.charAt(i);
            if (tmp == '(' || tmp == '[' || tmp == '{') {
                stack.push(tmp);
                continue;
            }
            if(stack.isEmpty()){ // will give EmptyStackException when input is all closing brackets eg-}}}}
                return false;
            }
            char check = stack.pop();
            if (tmp ==')' && (check=='{' || check=='[')) {
                return false;
            }
            else if (tmp =='}' && (check=='(' || check=='[')) {
                return false;
            }
            if (tmp ==']' && (check=='{' || check=='(')) {
                return false;
            }
        }
        return true;
    }
}