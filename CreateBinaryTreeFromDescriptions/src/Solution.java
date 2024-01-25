import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode root = new TreeNode();
        if (descriptions == null) {
            return root;
        }

        // need to find out a way to decide if is root
        for (int i = 0; i < descriptions.length; i++) {
            int p = descriptions[i][0];
            int k = descriptions[i][1];
            boolean isLeft = descriptions[i][2] == 1 ? true : false;
            
        }

        return root;
    }
}
