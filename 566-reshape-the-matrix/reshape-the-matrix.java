public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        // If the total number of elements does not match, return the original matrix
        if (m * n != r * c) {
            return mat;
        }
        
        int[][] reshapedMatrix = new int[r][c];
        int row = 0, col = 0;
        
        // Traverse the original matrix and fill the reshaped matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshapedMatrix[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        
        return reshapedMatrix;
    }
}