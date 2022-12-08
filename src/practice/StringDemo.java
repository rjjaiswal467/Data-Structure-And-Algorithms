package practice;

//Input:"I like Java I like Coding like"
//Output:{Java:1,Coding:1,I:2,like:3}

import java.util.HashMap;

public class StringDemo {

    static void frquency_String(String str){

        HashMap<String,Integer> hashMap = new HashMap<>();
        String[] str1 = str.split(" ");
        for(String str2 : str1){
            if (!(hashMap.containsKey(str2))){
                hashMap.put(str2,1);
            }
            else{
                hashMap.put(str2,hashMap.get(str2)+1);
            }
        }
    }

    public static void main(String[] args) {

        String str = "I like Java I like Coding like";
        StringDemo.frquency_String(str);
    }

}
