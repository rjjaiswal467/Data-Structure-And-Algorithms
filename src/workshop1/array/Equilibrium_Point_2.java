package workshop1.array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Equilibrium_Point_2 {

    public int equilibriumPosition(int arr[]){
        int n = arr.length;
        int sum = arr[0];
        int lp = 0;
        int rp = n-1;
        while(sum!=0){
            sum = arr[lp]-arr[rp];
            if(sum>0) {
                rp--;
                arr[lp]=sum;
            }
            if(sum<0) {
                lp++;
                arr[rp]= Math.abs(sum);
            }
            if(sum==0 && rp-lp>2){
                sum = arr[lp++]-arr[rp--];

            }
        }


        return lp+2;
    }

    public static void main(String[] args) {

        int[] array = {2,3,4,5,6,5,4,3,2}; //{1,3,1,4,5,2,5,4,5}; // {2,15,1,1}
        Equilibrium_Point_2 equilibrium_point_2 = new Equilibrium_Point_2();
        System.out.println(equilibrium_point_2.equilibriumPosition(array));
    }


}
