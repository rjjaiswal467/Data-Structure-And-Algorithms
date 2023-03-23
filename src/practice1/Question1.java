package practice1;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    String name = "Raj";


    public static void main(String[] args){

        int array[] = {1,2,3,4,5};


        Map<String ,String> hashmap = new HashMap<>();
        hashmap.put("Raj4","Jaiswal4");
        hashmap.put("Raj","Jaiswal");
        hashmap.put("Raj1","Jaiswal1");
        hashmap.put("Raj2","Jaiswal2");
        hashmap.put("Raj3","Jaiswal3");


        for (Map.Entry<String,String> entry:hashmap.entrySet()){
                System.out.println("Key:- " +entry.getKey()+ "| Values:- "+entry.getValue());
        }

    }
}
