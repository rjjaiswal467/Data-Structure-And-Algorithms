package workshop1.array;

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //taking testcases
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String str=br.readLine();
            String[] starr=str.split(" ");

            //input n and d
            int n=Integer.parseInt(starr[0]);
            int d= Integer.parseInt(starr[1]);

            int[] arr=new int[n];
            String str1=br.readLine();
            String[] starr1=str1.split(" ");

            //inserting elements in the array
            for(int j=0;j<n;j++)
            {
                arr[j]= Integer.parseInt(starr1[j]);
            }

            //calling rotateArr() function
            new Solution2().rotateArr(arr, d, n);
            StringBuffer sb=new StringBuffer();

            //printing the elements of the array
            for(int t1=0;t1<n;t1++)
                sb.append(arr[t1]+" ");
            System.out.println(sb);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution2
{
    //Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) //Todo Write 2nd method
    {
        int[] tmp_array = new int[d];
        int j=0;
        for (int i = 0; i < d; i++) {
            tmp_array[i]=arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }
        for (int i = n-d; i < n ; i++) {

            arr[i] = tmp_array[j];
            j++;
        }
    }
}
