import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head.val);
            head = head.next;
        }
        // int l = 0;
        // int r = nodes.size() - 1;
        return helper(nodes, 0, nodes.size() - 1);
    }

    private TreeNode helper(List<Integer> nodes, int l, int r) {
        if (l > r) {
            return null;
        }
        // int mid = (l + r) / 2;         // in some cases this may cause oom
        // keep using the middle values from List as roots under left and right interval
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(nodes.get(mid));
        root.left = helper(nodes, l, mid - 1);
        root.right = helper(nodes, mid + 1, r);
        return root;
    }
}
