package workshop1.array;

import java.util.HashMap;
import java.util.Map;

public class Each_Element_Frequency {

    public static void main(String[] args) {
        int array[] = {2, 4, 1, 5, 7, 3, 5, 4, 2, 5};

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {

            if (hashMap.containsKey(array[i])){
                hashMap.put(array[i],hashMap.get(array[i])+1);

            }
            else{
                hashMap.put(array[i],1);
//                System.out.println(hashMap.get(array[i]));
            }

        }
//        for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet())
//        {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
