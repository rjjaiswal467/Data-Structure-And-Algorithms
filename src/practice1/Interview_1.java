package practice1;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Interview_1 {

    static void frequency(int[] array,int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0; i< array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else{
                map.put(array[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map1: map.entrySet()){
            if(map1.getValue()>=k){
                treeSet.add(map1.getValue());
            }
        }
        for(Integer tree:treeSet){
            System.out.println(tree);
        }

    }

    public static void main(String[] args) {
        int[] array = {1,1,1,5,5,3};
        int k= 2;
        frequency(array,k);
    }
}
