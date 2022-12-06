package practice;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

//Good Morning
//God Mrni
public class Test11_copy {


    static void removeDuplicates(char str[], int n){

        HashMap<Character,Integer> store = new HashMap<>();
        for(int i=0; i< str.length;i++){
            if(store.containsKey(str[i]))
                store.put(str[i],store.get(str[i])+1);
                else{
                    store.put(str[i],1);
            }
        }

        for(Map.Entry<Character,Integer> entry : store.entrySet()){
            if(entry.getValue()==3)
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
//        for(char x : str)
//        {
//            store.add(x);
//        }
//        for (char x : store)
//            System.out.print(x);
    }
    public static void main(String[] args) {
        String tmp= "Good Morning";
        char input[] = tmp.toCharArray();
        int length = tmp.length();
        Test11_copy obj = new Test11_copy();
        Test11_copy.removeDuplicates(input,length);

        }
}
