package newpackage;

public class Rotate_Array {

    static void reverse(int[] array, int start, int end){
        while (start<end){
            int tmp = array[start];
            array[start] = array[end];
            array[end]=tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10,11};
        int d = 3;
        reverse(array,0, array.length-(d+1));
        reverse(array, array.length-d, array.length-1);
        reverse(array,0, array.length-1);

        for(Integer arr1:array){
            System.out.print(" "+arr1);
        }
    }
}
