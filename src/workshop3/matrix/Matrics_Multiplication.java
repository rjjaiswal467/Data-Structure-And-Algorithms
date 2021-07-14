package workshop3.matrix;
import java.io.*;
import java.util.*;

class Matrics_Multiplication
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

            Solution_Matrics_Multiplication ob = new Solution_Matrics_Multiplication();
            int ans[][] = ob.multiplyMatrix(A,B);
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
}// } Driver Code Ends


//User function Template for Java

class Solution_Matrics_Multiplication
{
    //Function to multiply two matrices.
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;
        int[][] Result = new int[n1][m2];
        int[][] emptyMatrix = new int[0][0];
        if (m1!=n2){
            return emptyMatrix;
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k <m1 ; k++) {
                    Result[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return Result;
    }
}
