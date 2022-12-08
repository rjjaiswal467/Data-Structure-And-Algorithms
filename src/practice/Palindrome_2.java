package practice;

import java.util.Stack;

public class Palindrome_2 {

    static boolean checkPalindrome(String A){

        Stack<String> stack = new Stack<>();
        String str[] = A.split("");
        for (String str1 : str){
            stack.push(str1);
        }

        for (String str1 : str){
            if(!stack.pop().equals(str1)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String A = "qwerytrewq";

        System.out.println(Palindrome_2.checkPalindrome(A));
    }
}
