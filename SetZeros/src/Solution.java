import java.util.HashSet;
import java.util.Set;

public class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>(); 
        
        // mark all the 0s indices
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        // set 0
        for (int row: rows) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
        }
        for (int col : columns) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col] = 0;
            }
        }
    }
}