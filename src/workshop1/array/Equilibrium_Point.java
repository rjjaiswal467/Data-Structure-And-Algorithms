package workshop1.array;

// { Driver Code Starts
import java.io.*;
import java.util.*;

class Equilibrium {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution_Eq ob = new Solution_Eq();

            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends



class Solution_Eq {


    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        long total_sum=0;
        float tmp=0;
        float tmp1;
        if(n==1){
            return 1;
        }
        for (int i = 0; i < n; i++) {
            total_sum = arr[i]+total_sum; // find total sum of the array
        }


        for (int i = 0; i < n-1; i++) { // {1,7,5,4,4} o/p=3
            tmp=arr[i]+tmp;
            tmp1=(float)(total_sum-arr[i+1])/2;
            if (tmp1==tmp){
                return i+2;
            }
        }
        return -1;
    }
}
