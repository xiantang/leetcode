package ArrayList;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i =0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix   [n-j-1][i]=  matrix[n-i-1][n-j-1];
                // matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-i-1]=tmp;

            }
        }

    }
}
