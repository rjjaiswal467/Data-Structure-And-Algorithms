package practice;

public class Matrix_Spiral {

    static void spiral_Print(int [][] matrix){

        int col = matrix[0].length;
        int row = matrix.length;
        int startRow = 0, endRow = row-1;
        int startCol = 0, endCol = col-1;

        while(startRow<=endRow && startCol<=endCol){

            //for top row
            for(int cols = startCol; cols<=endCol;cols++){
                System.out.println(matrix[startRow][cols]);
            }
            startRow++;

            //end col
            for(int rows = startRow; rows<=endRow;rows++){
                System.out.println(matrix[rows][endCol]);
            }
            endCol--;

            //bottom row
            for(int cols = endCol; cols>=startCol;cols--){
                System.out.println(matrix[endRow][cols]);
            }
            endRow--;

            //start col
            for(int rows = endRow; rows>=startRow;rows--){
                System.out.println(matrix[rows][startCol]);
            }
            startCol++;
        }
    }

    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},{16,17,18,19,20}};
        spiral_Print(matrix);

    }
}
