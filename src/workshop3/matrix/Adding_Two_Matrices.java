package workshop3.matrix;

import java.io.*;
import java.util.*;
class Adding_Two_Matrices
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();

            int A[][] = new int[n1][m1];
            for(int i = 0; i < n1; i++)
                for(int j = 0; j < m1; j++)
                    A[i][j] = sc.nextInt();

            int n2 = sc.nextInt();
            int m2 = sc.nextInt();
            int B[][] = new int[n2][m2];
            for(int i = 0; i < n2; i++)
                for(int j = 0; j < m2; j++)
                    B[i][j] =sc.nextInt();

            Solution_Adding_Two_Matrices ob = new Solution_Adding_Two_Matrices();
            int ans[][] = ob.sumMatrix(A,B);
            if(ans.length == 0)
                System.out.println(-1);
            else
            {
                for(int i = 0; i < ans.length; i++)
                    for(int j = 0; j < ans[0].length; j++)
                        System.out.print(ans[i][j] +" ");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution_Adding_Two_Matrices
{
    //Function to add two matrices.
    static int[][] sumMatrix(int A[][], int B[][])
    {
        int n1=A.length;// returns no. of Rows
        int m1=A[0].length; // returns no. of Column
        int n2=B.length;
        int m2=B[0].length;
        int[][] array = new int[0][0];
        if(n1!=n2 || m1!=m2){
            return array;
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                A[i][j] = A[i][j] + B[i][j];
            }
        }
        return A;
    }
}
