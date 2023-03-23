package practice1;

public class SecondLargest {
    public static int second(int[] array){
        int large = 0;
        int secondLarge = 0;
        for(int i=0;i< array.length-2;i++){

            if(array[i]>array[i+1]){
                large = array[i];
            }

            if(array[i]>secondLarge && array[i+1]<large){
                secondLarge = array[i+1];
            }
        }
        return secondLarge;
    }
    public static void main(String[] args) {
        int[] array = {1,2,9,7,4,10,6,8,3};
        System.out.println(second(array));
    }
}
