import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recursive(root, res);
        return res;
    }

    private void recursive(TreeNode root, List<Integer> res) {
        if (root != null) {
            recursive(root.left, res);
            res.add(root.val);
            recursive(root.right, res);
        }
    }

    public List<Integer> inorderIterativ(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stacks = new Stack<>();
        TreeNode currentNode = root;

        while(!stacks.empty() || currentNode != null) {
            if (currentNode != null) {
                stacks.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stacks.pop();
                res.add(currentNode.val);
                currentNode = currentNode.right;
            }
        }
        return res;
    }
}
