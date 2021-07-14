package workshop1.array;

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

 class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int i=0; i<N; i++)
                a[i] = sc.nextInt();

            Solution g = new Solution();
            int n = g.remove_duplicate(a,N);

            for(int i=0; i<n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
            T--;
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int remove_duplicate(int A[], int N) {
        int[] tmp = new int[N];
        int j=0;
        for (int i = 0; i < N; i++) {
            while( i<=A.length-2 && A[i]==A[i+1]){ // till A.length-2 bc of {5,5,5,7,7}
                i++;
            }
            tmp[j]=A[i];
            j++;
        }

        for (int i =0;i<tmp.length;i++)
            A[i]=tmp[i];
        return j;
    }
}