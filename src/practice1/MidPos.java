package practice1;

public class MidPos {

    static int largest_Number(int[] array){
        int high = 0;
        int mid = array.length/2;
        while (mid< array.length){

            if(array[mid]>array[mid-1] && array[mid]>array[mid+1]){
                high =array[mid];
                break;
            }
            if(array[mid]<array[mid+1]){
                mid = ((array.length-mid)/2)+mid;
            }
            if(array[mid]<array[mid-1]){
                mid = mid/2;
            }

        }
        return high;
    }

    public static void main(String[] args) {

        int[] array = {56, 77,88, 24, 11,10,9,8,7,6,5,4,3,2,1,0};

        System.out.println(largest_Number(array));

    }
}