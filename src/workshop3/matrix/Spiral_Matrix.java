package workshop3.matrix;

public class Spiral_Matrix {
    public static void printSpiral(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int startRow = 0, endRow = rows - 1;
        int startCol = 0, endCol = cols - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // for top row
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(matrix[startRow][col] + " ");
            }
            startRow++;

            // for right column
            for (int row = startRow; row <= endRow; row++) {
                System.out.print(matrix[row][endCol] + " ");
            }
            endCol--;

            // for bottom row
                for (int col = endCol; col >= startCol; col--) {
                    System.out.print(matrix[endRow][col] + " ");
                }
                endRow--;

            // for left column
                for (int row = endRow; row >= startRow; row--) {
                    System.out.print(matrix[row][startCol] + " ");
                }
                startCol++;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printSpiral(matrix);
    }
}
