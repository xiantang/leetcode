package ArrayList;

public class SpiralMatrix {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        if (n == 0) {
            return matrix;
        }

        if (n == 1) {
            matrix[0][0] = 1;
            return matrix;
        }

        //variables to keep track of rows and columns of matrix
        int x1 = 0;
        int x2 = n - 1;
        int y1 = 0;
        int y2 = n - 1;

        int count = 1;

        //while loop to traverse the matrix
        while (x1 <= x2 && y1 <= y2) {
            for (int i = y1; i <= y2; i++) {
                matrix[x1][i] = count++;
            }

            for (int i = x1 + 1; i <= x2; i++) {
                matrix[i][y2] = count++;
            }

            for (int i = y2 - 1; i >= y1; i--) {
                matrix[x2][i] = count++;
            }

            for (int i = x2 - 1; i > x1; i--) {
                matrix[i][y1] = count++;
            }

            x1++;
            y1++;
            x2--;
            y2--;
        }

        //return the answer
        return matrix;

    }
}





