import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int nodes = 3;
        List<TreeNode> trees = solution.buildBST(nodes);

        for (TreeNode tree: trees) {
            List<Integer> res = new ArrayList<>();
            preorderTraversal(tree, res);
            System.out.println(res);
        }

    }

    private static void preorderTraversal(TreeNode tree, List<Integer> res) {
        if (tree != null) {
            res.add(tree.val);
            preorderTraversal(tree.left, res);
            preorderTraversal(tree.right, res);
        } else {
            res.add(null);
        }
    }
}
