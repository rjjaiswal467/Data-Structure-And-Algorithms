package workshop3.string;

public class Palindrome {

    static boolean palindrome_Check(String str){
        int i=0;
        int j = str.length()-1;
        boolean check=false;
            while(i<j && str.charAt(i)==str.charAt(j)){
                i++;
                j--;
        }
            if(i<j)
        return false;
            else
                return true;
    }
    public static void main(String[] args) {
        String str = "AAAddAAA";
        System.out.println(palindrome_Check(str));
    }
}
