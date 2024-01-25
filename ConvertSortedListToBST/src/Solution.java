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
        //return helper(nodes, 0, nodes.size() - 1);
        return helper2(head, null);
    }

    /**
     * this is the naive way by convert ListNode to array, it will cause extra memory consume
     * @param nodes
     * @param l
     * @param r
     * @return
     */
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

    /**
     * Approach by using slow & fast pointers, much quicker
     * @param head
     * @param tail
     * @return
     */
    private TreeNode helper2(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == tail) {
            return null;
        }

        while (fast != tail && fast.next != tail) {
            // the slower pointer will just get the middle position of ListNode when faster pointer reach the end of ListNode
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);
        root.left = helper2(head, slow);
        root.right = helper2(slow.next, tail);
        return root;
    }
}
