class Solution {
    public void setZeroes(int[][] matrix) {
        boolean zeroInFirstCol = false;

        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 0; row < rows; row++) {
            if (matrix[row][0] == 0) {
                zeroInFirstCol = true;
            }

            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
        for (int row = rows - 1; row >= 0; row--) {
            for (int col = cols - 1; col >= 1; col--) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }

            if (zeroInFirstCol) {
                matrix[row][0] = 0;
            }
        }
    }
}