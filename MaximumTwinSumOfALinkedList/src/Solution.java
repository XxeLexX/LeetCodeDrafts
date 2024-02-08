public class Solution {
    public int pairSum(ListNode head) {
        // 从中间砍断，然后对折（也就是后半部分进行翻转）
        // 1 -> 2 -> 3 -> 4 -> 5 ->6
        // 1 -> 2 -> 3
        // 6 -> 5 -> 4

        // 快慢指针，快指针到了的时候，慢指针作为后半部分的开始
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 然后从p1开始反转链表
        ListNode last = null;
        ListNode cur = slow;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = last;
            last = cur;
            cur = temp;
        }

        // last作为第二段的起点和head相加就行了
        int max = 0;
        while (last != null) {
            max = Math.max(max, last.val + head.val);
            last = last.next;
            head = head.next;
        }
        return max;
    }
}
