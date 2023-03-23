package newpackage;

import java.util.HashMap;
import java.util.Map;

public class Unique {
    //BOOKKEEPER
    static void returnUnique(String s){
        Map<Character,Integer> map = new HashMap<>();


        for(int i=0 ; i<s.length();i++){

            if(!map.containsKey(s.charAt(i))) {
            map.put(s.charAt(i),1);
            }
            else
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1)
            System.out.println(entry.getKey()+" "+ entry.getValue() );
        }


    }

    public static void main(String[] args) {
        String S = "BOOKKEEPER";
        Unique.returnUnique(S);

    }



}
