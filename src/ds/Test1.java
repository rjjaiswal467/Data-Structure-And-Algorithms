package ds;

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking total testcases
        int T=sc.nextInt();

        while(T-->0)
        {
            Solution obj=new Solution();
            int N;

            //taking N
            N=sc.nextInt();

            //calling method digitsInFactorial()
            System.out.println(obj.digitsInFactorial(N));

        }

    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public int digitsInFactorial(int N){
        double tmp = 0;
        for (int i=1;i<=N;i++){
            tmp = Math.log10(i)+tmp;
        }
        int res = (int) tmp;
        return (res+1);
    }
}
