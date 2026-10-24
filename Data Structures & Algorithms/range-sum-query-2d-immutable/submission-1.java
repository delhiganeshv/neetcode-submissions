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

        if (row1 > 0 && col1 > 0) {
            sum = prefixMatrix[row2][col2] - prefixMatrix[row1 -1][col2] - prefixMatrix[row2][col1 - 1] + prefixMatrix[row1 - 1][col1 -1];
        } else if (row1 > 0) {
            sum = prefixMatrix[row2][col2] - prefixMatrix[row1 -1][col2];
        } else if (col1 > 0) {
            sum = prefixMatrix[row2][col2] - prefixMatrix[row2][col1 - 1];
        } else {
            sum = prefixMatrix[row2][col2];
        }

        return sum;
        
    }

    private void constructPrefixMatrix(int[][] matrix, int rowsLen, int colsLen) {
        for(int row = 0; row < rowsLen; row++) {
            for(int col = 0; col < colsLen; col++) {
                int prefixSum = 0;
                if(row > 0 && col > 0) {
                    prefixSum = matrix[row][col] + prefixMatrix[row - 1][col] + prefixMatrix[row][col - 1] - prefixMatrix[row - 1][col - 1];
                } else if (row > 0) {
                    prefixSum = matrix[row][col] + prefixMatrix[row -1][col];
                } else if (col > 0) {
                    prefixSum = matrix[row][col] + prefixMatrix[row][col - 1];
                } else {
                    prefixSum = matrix[row][col];
                }

                prefixMatrix[row][col] = prefixSum;
            }
        }
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */