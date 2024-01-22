import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
    
        Solution solution = new Solution();
        List<Integer> res = solution.inorderTraversal(root);
        List<Integer> res2 = solution.inorderIterativ(root);

        System.out.println(res);
        System.out.println(res2);
    }
}
