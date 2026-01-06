public class Solution {
    public boolean hasCycle(ListNode head) {
        // Edge case: empty list or single node
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list
        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;   // move 2 steps

            // If they meet, cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // If fast reaches null, no cycle
        return false;
    }
}
