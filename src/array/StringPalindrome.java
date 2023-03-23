package array;

import java.util.Stack;

public class StringPalindrome {

    public static String solution(String S) {
        StringBuffer sb = new StringBuffer(S);

        int end = S.length()-1;
        for (int i=0; i<S.length()/2; i++){
            if (S.charAt(i) == '?' && S.charAt(end)!='?') {
                sb.replace(i,i+1, String.valueOf(S.charAt(end)));
            }
            if (S.charAt(i) != '?' && S.charAt(end)=='?') {
                sb.replace(end,end+1, String.valueOf(S.charAt(i)));
            }
            if (S.charAt(i) == '?' && S.charAt(end)=='?') {
                sb.replace(i, i+1, "a");
                sb.replace(end,end+1,"a");
            }
            end--;
        }
        int i=0;
        int j = sb.length()-1;
        boolean check=false;
        while(i<j && sb.charAt(i)==sb.charAt(j)){
            i++;
            j--;
        }
        if(i<j)
            return "NO";
        else
        return sb.toString();
    }

    public static void main(String[] args) {
        String S = "qwerty?i?poiuyt?ewq";
        System.out.println(StringPalindrome.solution(S));
//        StringPalindrome.solution(S);
    }
}
