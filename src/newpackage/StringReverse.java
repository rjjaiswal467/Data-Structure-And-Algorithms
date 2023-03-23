package newpackage;

import java.util.Stack;

public class StringReverse {
    static void rev_String(String str){
        int start =0;
        int end = str.length()-1;

        StringBuffer sb = new StringBuffer();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= ' '){
                st.push(str.charAt(i));
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= ' '){
            sb.append(st.pop());
            }
            else{
                sb.append(' ');
            }
        }
        System.out.println(sb); // output "g ni rtS toNmAI"
    }
    public static void main(String[] args) {
        String str = "I Am Not String";
        rev_String(str);

    }

}
