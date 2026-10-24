class NumMatrix {

    private int[][] prefixMatrix;

    public NumMatrix(int[][] matrix) {
        int rowsLen = matrix.length;
        int colsLen = matrix[0].length;
        prefixMatrix = new int[rowsLen][colsLen];

        constructPrefixMatrix(matrix, rowsLen, colsLen);
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;

        for(int row = row1; row <= row2; row++) {
            sum += prefixMatrix[row][col2];

            if (col1 > 0) {
                sum -= prefixMatrix[row][col1 - 1];
            }
        }

        return sum;
        
    }

    private void constructPrefixMatrix(int[][] matrix, int rowsLen, int colsLen) {
        for(int row = 0; row < rowsLen; row++) {
            prefixMatrix[row][0] = matrix[row][0];

            for(int col = 1; col < colsLen; col++) {
                prefixMatrix[row][col] = prefixMatrix[row][col - 1] + matrix[row][col];
            }
        }
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */