class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Edge cases
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find length and tail
        ListNode curr = head;
        int length = 1;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        ListNode tail = curr;

        // Step 2: Reduce k
        k = k % length;
        if (k == 0) return head;

        // Step 3: Make circular
        tail.next = head;

        // Step 4: Find new tail
        int stepsToNewTail = length - k;
        curr = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            curr = curr.next;
        }

        // Step 5: Break the circle
        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}
