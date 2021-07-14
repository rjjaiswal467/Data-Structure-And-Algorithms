package workshop1.mathematics;

import java.util.Scanner;

public class Lcm_More_Than_Two_Number {


    static long gcd (long a, long b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    static long lcm (long a, long b){
        return (a*b/gcd(a,b));
    }

    static long getSmallestDivNum (int a){
        if (a==1){
            return 1;
        }
        else {
            long res=0;
            long[] arr = new long[a];
            for (int i=0;i<a;i++){
                arr[i]=i+1;
            }
            for (int i=0; i<arr.length-1;i++){
                res = lcm(arr[i],arr[i+1]);
                arr[i+1] = lcm(arr[i],arr[i+1]);
            }
            return res;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(getSmallestDivNum(a));

    }
}
