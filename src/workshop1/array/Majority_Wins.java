package workshop1.array;

// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // input testcases

        while (t-- > 0) // Loop until we exhaust all testcases
        {
            int n = sc.nextInt(); // Input size of array n
            int arr[] = new int[n]; // Declaring the array
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr[i] = x; // Assigning elements to array
            }

            int x = sc.nextInt(); // Input x
            int y = sc.nextInt(); // Input y

            Solution3 obj = new Solution3(); // object to call the function
            System.out.println(
                    obj.majorityWins(arr, n, x, y)); // The functions you complete
        }
    }
}
class Solution3 {

    public int majorityWins(int arr[], int n, int x, int y) {

        int count=0;
        int high_freq;

        for (int i = 0; i < n; i++) {
            if (arr[i]==x){
                count++;
            }
            else if (arr[i]==y){
                count--;
            }
        }
         high_freq=(count>0)?x:y;
        if (count==0){
            high_freq = Math.min(x,y);
        }

        return high_freq;
    }
}
