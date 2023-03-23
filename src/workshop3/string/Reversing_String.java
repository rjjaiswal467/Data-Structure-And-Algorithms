package workshop3.string;

public class Reversing_String {

    static String reverse_String(String str){
        int i=0;
        int j= str.length()-1;
        StringBuffer sb = new StringBuffer(str);
        char ch = ' ';
        while(i<j){

            ch = str.charAt(i);
            sb.replace(i,i+1, String.valueOf(sb.charAt(j)));
            sb.replace(j,j+1, String.valueOf(ch));
            i++;
            j--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Deepak";
        System.out.println(reverse_String(str));

    }
}
