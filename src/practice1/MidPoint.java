package practice1;

public class MidPoint {

    public static int[] rearrangeArray(int[] array) {

        int tmp_pos=0;

        for(int i=0; i<array.length;i++){
            if(array[i]!=0){
                int tmp = array[tmp_pos];
                array[tmp_pos] = array[i];
                array[i]=tmp;
                tmp_pos++;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array =  {0,0,8,3,0,0,4,0,4,2,0,0,0};// O/P = {8,3,4,4,2,0,0,0,0,0,0,0,0}

        for(Integer arr :MidPoint.rearrangeArray(array) )
        {
            System.out.println(arr);
        }

    }
}
