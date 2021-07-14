package workshop5.stack;
import java.lang.*;
import java.io.*;
import java.util.Stack;

class GFG_Postfix_Evaluation {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            System.out.println(new Postfix_Evaluation().evaluatePostFix(br.readLine().trim()));
        }
    }
}

class Postfix_Evaluation
{
    public static float evaluatePostFix(String S)
    {
        float result=0f;
        Stack<Float> stack = new Stack<>();
        int len=S.length();
        int i=0;
        while(i<len){
            if(Character.isLetterOrDigit(S.charAt(i))){
                stack.push((float)S.charAt(i)-'0');
                i++;
                continue;
            }
            if(stack.size()==1){
                return stack.peek();
            }
            float val1= stack.pop();
            float val2 = stack.pop();
            if (S.charAt(i)=='+'){
                result = val2+val1;
                stack.push(result);
            }
            if (S.charAt(i)=='-'){
                result = val2-val1;
                stack.push(result);
            }
            if (S.charAt(i)=='/'){
                result = val2/val1;
                stack.push(result);
            }
            if (S.charAt(i)=='*'){
                result = val2*val1;
                stack.push(result);
            }
            i++;
        }
        return result;
    }
}
