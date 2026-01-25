class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {
            // If duplicate detected
            if (head.next != null && head.val == head.next.val) {
                int dupVal = head.val;
                // Skip all nodes with this value
                while (head != null && head.val == dupVal) {
                    head = head.next;
                }
                prev.next = head;
            } else {
                prev = prev.next;
                head = head.next;
            }
        }
        return dummy.next;
    }
}
