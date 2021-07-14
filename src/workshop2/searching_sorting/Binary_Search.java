package workshop2.searching_sorting;

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG_Binary {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
            int n = sc.nextInt();
            int arr[] = new int[n];
        System.out.println("enter element");
            for(int i=0;i<n;i++)
            {

                arr[i]=sc.nextInt();
            }
        System.out.println("enter key to find");
            int key =sc.nextInt();
            Solution_Binary g = new Solution_Binary();
            System.out.println(g.binarysearch(arr,n,key));


    }
}

// } Driver Code Ends


//User function Template for Java

class Solution_Binary {
    int binarysearch(int arr[], int n, int k){
        int l=0;
        int r=n-1;
        int mid;
        while(l<=r)
        {
            mid = (l + r) / 2;
            if (arr[mid] == k) {
                return mid;
            }
             if (arr[mid] > k) {
                r = mid - 1;
            }
            else if (arr[mid] < k){
                l = mid + 1;
            }
        }
        return -1;
    }
}
