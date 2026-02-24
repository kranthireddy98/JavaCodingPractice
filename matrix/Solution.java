package matrix;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                if (number != '.') {
                    // The 'Box' formula: (row/3) and (col/3) 
                    // This groups indices 0,1,2 together, 3,4,5 together, etc.
                    String rowKey = "row" + i + number;
                    String colKey = "col" + j + number;
                    String boxKey = "box" + (i/3) + "-" + (j/3) + number;

                    // If any of these adds fail, it's a duplicate!
                    if (!seen.add(rowKey) || 
                        !seen.add(colKey) || 
                        !seen.add(boxKey)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
        {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};

        boolean st = isValidSudoku(board);
    }
}