package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Anagram2 {

    static boolean checkAnagram(String A, String B){

        Stack<Character> st1 = new Stack<Character>();
        for (int i=0; i<A.length();i++){
            st1.push(A.charAt(i));
        }
        List<Character> l1 = new ArrayList<>();
        for (int i=0; i<B.length(); i++){
            l1.add(B.charAt(i));
        }
        int len = A.length();
        while(len>0){
            l1.remove(st1.pop());
            len--;
        }
        if(l1.isEmpty() && st1.isEmpty()){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {

        String A = "qwertyshshhs";
        String B = "wretqjhdh";

        System.out.println(Anagram2.checkAnagram(A,B));
    }
}
