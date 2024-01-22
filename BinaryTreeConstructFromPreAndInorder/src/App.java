public class App {
    public static void main(String[] args) throws Exception {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        Solution solution = new Solution();
        TreeNode res = solution.buildTree(preorder, inorder);
        System.out.println(res.val);
    }
}