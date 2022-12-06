package practice;


import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

//Good Morning
//God Mrni
public class Test11 {


    static void removeDuplicates(char str[], int n){

        HashSet<Character> store = new LinkedHashSet<>();
        for(int i=0; i< str.length;i++){
            store.add(str[i]);
        }
//        for(char x : str)
//        {
//            store.add(x);
//        }
        for (char x : store) {
            int ascii = x;
            System.out.print(x);
        }

    }


    public static void main(String[] args) {
        String tmp= "Good Morning";
        char input[] = tmp.toCharArray();
        int length = tmp.length();
        Test11.removeDuplicates(input,length);

        }
}
