class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        // If list is empty or has only one node
        if (head == null) {
            return head;
        }

        ListNode current = head;

        // Traverse the list
        while (current.next != null) {

            // If duplicate found
            if (current.val == current.next.val) {
                current.next = current.next.next; // skip duplicate
            } else {
                current = current.next; // move forward
            }
        }

        return head;
    }
}
