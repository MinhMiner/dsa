// Function Description
// Complete the deleteNode function in the editor below.

// deleteNode has the following parameters:
//     - SinglyLinkedListNode pointer llist: a reference to the head node in the list
//     - int position: the position of the node to remove
// Returns
//     - SinglyLinkedListNode pointer: a reference to the head of the modified list

public class LinkedList5 {
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here
        if (position == 0) {
            return llist.next;
        }

        int index = 1;
        SinglyLinkedListNode current = llist;
        while (index < position) {
            current = current.next;
            index++;
        }
        current.next = current.next.next;
        return llist;
    }
}
