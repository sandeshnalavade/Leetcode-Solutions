class Solution {    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to simplify appending new nodes
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        int carry = 0;

        // Loop through both lists
        while (l1 != null || l2 != null) {
            // Use 0 if one list is shorter than the other
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate sum and carry
            int sum = x + y + carry;
            carry = sum / 10;

            // Create a new node with the sum's digit
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in each list
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there is any carry left, add it as a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // The result list starts at dummyHead.next
        return dummyHead.next;
    }
}
