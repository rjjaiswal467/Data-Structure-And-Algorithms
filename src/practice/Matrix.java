package practice;

import java.sql.SQLOutput;

public class Constants {

    public static void main(String[] args) {

        int[][] A = {{4, 8},
                     {0, 2},
                     {1, 6}};

        int[][] B = {{5, 2},
                     {9, 4}};
        Solution_Matrics_Multiplication1.multiplyMatrix(A,B);
    }

}

class Solution_Matrics_Multiplication1
{
    //Function to multiply two matrices.
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        int AR = A.length;
        int AC = A[0].length;
        int BR = B.length;
        int BC = B[0].length;
        if(AC!=BR){
            System.out.println("Multiplication is not possible");
        }



        int[][] result = new int[1][1];






        return result;
    }
}
