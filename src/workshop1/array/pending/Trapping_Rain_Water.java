package workshop1.array.pending;
//Trapping_Rain_Water
// { Driver Code Starts
import java.io.*;
import java.lang.*;


class Array_Rain {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){

            //size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Trapping_Rain_Water obj = new Trapping_Rain_Water();

            //calling trappingWater() function
            System.out.println(obj.trappingWater(arr, n));
        }
    }
}

// } Driver Code Ends




class Trapping_Rain_Water{

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) {
        int j;
        int total=0;
        for (int i = 0; i < n-1; i++) {
            j=i;
            int tmp=0;
            while(i<n-1 && arr[j]>=arr[i+1]){
                tmp = tmp + (arr[j]-arr[i+1]);
                i++;
            }
            if (i!=n-1 && arr[j]<=arr[i+1]){
                total = total+tmp;
            }
        }
        return total;
    }
}
