// Function Description
// Complete the mergeLists function in the editor below.

// mergeLists has the following parameters:
//     SinglyLinkedListNode pointer headA: a reference to the head of a list
//     SinglyLinkedListNode pointer headB: a reference to the head of a list
// Returns
//     SinglyLinkedListNode pointer: a reference to the head of the merged list

public class LinkedList9 {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode current = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = new SinglyLinkedListNode(head1.data);
                head1 = head1.next;
            } else {
                current.next = new SinglyLinkedListNode(head2.data);
                head2 = head2.next;
            }
            current = current.next;
        }

        if (head1 == null) {
            current.next = head2;
        } else {
            current.next = head1;
        }

        return dummy.next;
    }
}
