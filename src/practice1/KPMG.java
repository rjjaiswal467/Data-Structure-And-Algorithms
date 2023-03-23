package practice1;

import java.util.TreeSet;

//int[] arr= {-6,1,2,3,4,5};
public class KPMG {

    static void create(int[] array){
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i=0;i< array.length;i++){
            treeSet.add(array[i]*array[i]);
        }

        for(Integer set: treeSet){
            System.out.println(set);
        }
    }
    public static void main(String[] args) {
        int[] arr= {-6,1,2,3,4,5};
        create(arr);
    }
}
