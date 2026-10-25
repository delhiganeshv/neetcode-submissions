class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<String, Set<Character>> subMatrices = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    Set<Character> row = rows.computeIfAbsent(i, k -> new HashSet<>());
                    boolean alreadyInRow = !row.add(board[i][j]);

                    Set<Character> column = columns.computeIfAbsent(j, k -> new HashSet<>());
                    boolean alreadyInCol = !column.add(board[i][j]);

                    String subMatrixKey = String.format("%d,%d", i / 3, j / 3);
                    Set<Character> subMatrix = subMatrices.computeIfAbsent(subMatrixKey, k -> new HashSet<>());
                    boolean alreadyInMatrix = !subMatrix.add(board[i][j]);

                    if (alreadyInRow || alreadyInCol || alreadyInMatrix) {
                        return false;
                    }
                }
            }
        }

        return true;
        
    }
}
