// Function Description
// Complete the reverse function in the editor below.

// reverse has the following parameter:
//     SinglyLinkedListNode pointer head: a reference to the head of a list
// Returns
//     SinglyLinkedListNode pointer: a reference to the head of the reversed list

public class LinkedList7 {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
        if (llist == null || llist.next == null) {
            return llist;
        }

        SinglyLinkedListNode result = new SinglyLinkedListNode(llist.data);
        SinglyLinkedListNode current = llist.next;
        while (current != null) {
            result = insertNodeAtHead(result, current.data);
            current = current.next;
        }
        return result;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist;
        return newNode;
    }
}
