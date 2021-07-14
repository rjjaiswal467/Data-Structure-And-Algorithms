package workshop1.array;

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

    class GFG1 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases

        //while testcases exist
        while(t-->0){

            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);

            ArrayList<Integer> arr = new ArrayList<>();
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr.add(Integer.parseInt(inputLine2[i]));
            }

            Solution1 obj = new Solution1();
            obj.reverseInGroups(arr, n, k);

            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution1 {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int i=0;
        while(i<arr.size()){

            for (int j = i; j <(i+k/2); j++) {
                //int tmp = arr.get(j);
                    int start = arr.get(j);
                    int end = arr.get(i + k - 1);
                    arr.set(j, end);
                    arr.set(i + k - 1, start);
            }
            i=i+k;
        }
    }
}
