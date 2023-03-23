package practice;

import java.util.Stack;

public class Split_Example {

    static void reverse_Word(String A){

        String splitArray[] = A.split(" ");
        Stack<String> stack = new Stack<>();
        for (String str: splitArray){
            stack.push(str);
        }

        while(!stack.empty()){
            System.out.print(stack.pop()+ " ");
        }


    }

    public static void main(String[] args) {

        String A = "A white ball in ODI";
        Split_Example.reverse_Word(A);
    }
}
