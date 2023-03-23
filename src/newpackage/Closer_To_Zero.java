package newpackage;

import java.util.HashSet;

public class Closer_To_Zero { //Number closer to zero,+ve and not present
    static int returnNumber(int[] number){
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer arr: number){
            hashSet.add(arr);
        }

        for(int i=1;i<number.length;i++){
            if(!hashSet.contains(i)){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {0,-2,-3,6,2,6,3,8,5,10};
        System.out.println(returnNumber(array));

    }
}
