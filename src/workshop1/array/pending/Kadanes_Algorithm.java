package workshop1.array.pending;
//Kadanes_Algorithm
// { Driver Code Starts
import java.io.*;
import java.util.Arrays;

class Main_Kadane {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            //size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Kadanes_Algorithm obj = new Kadanes_Algorithm();

            //calling maxSubarraySum() function
            System.out.println(obj.maxSubarraySum(arr, n));
        }
    }
}

// } Driver Code Ends


class Kadanes_Algorithm{

    int maxSubarraySum(int arr[], int n){
        return 0;
    }

}
