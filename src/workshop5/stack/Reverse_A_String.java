package workshop5.stack;

import java.io.*;
        import java.util.*;

class Reverse_A_String {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution_Reverse_A_String obj = new Solution_Reverse_A_String();
            System.out.println(obj.reverse(sc.next()));
        }
    }
}
// } Driver Code Ends


class Solution_Reverse_A_String {

    public String reverse(String S){

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

}
