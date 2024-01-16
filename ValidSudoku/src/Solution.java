import java.util.HashSet;

public class Solution {
    /**
     * 3 steps
     * - check row
     * - check column
     * - check 3x3 matrix
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> checkpoints = new HashSet<>();
        
        // check row
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (checkpoints.contains(num) && num != '.') {
                    System.err.println(num + " is repeated at [" + i + "]" + "[" + j + "]");
                    return false;
                }
                checkpoints.add(num);
            }
            checkpoints.clear();
        }

        // check column
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[j][i];
                if (checkpoints.contains(num) && num != '.') {
                    System.err.println(num + " is repeated at [" + j + "]" + "[" + i + "]");
                    return false;
                }
                checkpoints.add(num);
            }
            checkpoints.clear();
        }

        // check 3x3 matrix
        // code beginnt here...
        return true;
    }
}