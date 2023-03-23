package newpackage;

public class MatrixOperations {

    static int[][] Addition(int[][] A,int[][] B){
        int rowA =A.length;
        int rowB = B.length;
        int colA = A[0].length;
        int colB = B[0].length;
        int[][] result = new int[rowB][colA];
        for (int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++){
                result[i][j] = A[i][j]+B[i][j];
            }
        }
        return  result;
    }

    static int[][] Multiplication(int[][] A,int[][] B){
        int rowA =A.length;
        int rowB = B.length;
        int colA = A[0].length;
        int colB = B[0].length;
        int[][] result = new int[rowA][colB];
        if(colA!=rowB){
            return null;
        }
        for (int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++){
                for(int k=0;k<colA;k++)
                result[i][j]+= A[i][k]*B[k][j];
            }
        }
        return  result;
    }

    public static int[][] rotateMatrix(int[][] matrix, int n) {
        // Transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        return matrix;
    }


    static void printMatrix (int result[][]){
        for(int i =0; i< result.length;i++){
            for(int j =0 ; j<result[0].length;j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] A={ { 1, 2 },
                    { 4, 5 } };

        int[][] B = { { 5, 6 },
                      { 8, 9 } };

        int[][] matrix_Rotate = {{1, 2, 3},
                                 {4, 5, 6},
                                 {7, 8, 9}};

        System.out.println("Addition");
        printMatrix(Addition(A,B));

        System.out.println("Multiplication");
        printMatrix(Multiplication(A,B));


        System.out.println("Matrix Before Rotation");
        printMatrix(matrix_Rotate);
        System.out.println("Matrix Rotation");
        printMatrix(rotateMatrix(matrix_Rotate, matrix_Rotate.length));



    }
}
