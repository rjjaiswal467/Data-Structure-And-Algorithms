package array;

public class Smallest_string {

    static String print_SmallString (String s){

        char c= s.charAt(s.length()-1);
        StringBuffer sb = new StringBuffer(s);
        int tmp=s.length()-1;

        for (int i=0; i<s.length()-1; i++){
            if(s.charAt(i)>s.charAt(i+1)){
//                c= (s.charAt(i));
                tmp=i;
                break;
            }
        }
        sb= sb.delete(tmp,tmp+1);
//        for (int i=0;i<s.length();i++){
//            if((!((s.charAt(i)==c)))) {
//                sb.append(s.charAt(i));
//            }
//        }

        return sb.toString();

    }


    public static void main(String[] args) {

        String s = "acd";
        System.out.println(print_SmallString(s));
    }
}
