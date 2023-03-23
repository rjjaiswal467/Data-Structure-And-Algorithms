package array;

public class Splitting {

    static void split(int[] array, int size){


        for (int i =0; i< array.length; i=i){
            int count = size;
            while (count>0 && i< array.length){
                System.out.print(array[i] +" ");
                count--;
                i=i+1;
            }
//            i--;
            System.out.println();


        }

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int size = 3;

        Splitting.split(array, size);
    }
}
