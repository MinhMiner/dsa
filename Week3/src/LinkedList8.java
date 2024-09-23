// Function Description
// Complete the compare_lists function in the editor below.

// compare_lists has the following parameters:
//     SinglyLinkedListNode llist1: a reference to the head of a list
//     SinglyLinkedListNode llist2: a reference to the head of a list
// Returns
//     boolean: return true if the lists are equal, or false otherwise

public class LinkedList8 {
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null) {
            return true;
        }

        if (head1 == null || head2 == null) {
            return false;
        }

        if (head1.data != head2.data) {
            return false;
        }

        return compareLists(head1.next, head2.next);
    }
}
