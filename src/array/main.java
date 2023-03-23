package array;

import java.util.*;

class Main
{
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12};
        int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {

        List<int[]> list = new ArrayList<>();

        for(int i=0; i<array.length;i=i){
            int count = splitSize;
            int index = 0;
            if(array.length-i>splitSize)
                count = splitSize;
            else
                count = array.length-i;

            int[] subArray = new int[count];
            while(count>0){
                subArray[index]=array[i];
                i++;
                count--;
                index++;

            }
            list.add(subArray);
        }
        return list;
    }
}
