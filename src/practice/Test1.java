package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

class Test1 {
    String xyz;
    static HashMap<String, String> map = new HashMap<>();


//    public Map<String, String> getMap(){
//        for (Map.Entry<String, String> entry : map.entrySet()){
//            map.put(entry.getKey(), entry.getValue());
////            System.out.println(map.get("A"));
//        }
//        return map;
//    }

    public String getMap(){
//        for (Map.Entry<String, String> entry : map.entrySet()){
//
//        }
        for(Map.Entry<String, String> map1:map.entrySet()){
            xyz= map1.getValue();
        }
        return xyz;
    }
    public static void main(String args[]) {
        map.put("A","B");
        Test1 test1 = new Test1();
//        test1.getMap();
        System.out.println(test1.getMap());
//        System.out.println(test1.getMap().get("A"));

    }
}