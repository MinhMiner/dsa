// Function Description Complete the function insertNodeAtPosition in the editor below. It must return a reference to the head node of your finished list.

// insertNodeAtPosition has the following parameters:
//     head: a SinglyLinkedListNode pointer to the head of the list
//     data: an integer value to insert as data in your new node
//     position: an integer position to insert the new node, zero based indexing
// Returns
//     SinglyLinkedListNode pointer: a reference to the head of the revised list

public class LinkedList4 {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (position == 0) {
            newNode.next = llist;
            return newNode;
        }

        int index = 1;
        SinglyLinkedListNode current = llist;
        while (index < position) {
            current = current.next;
            index++;
        }
    
        newNode.next = current.next;
        current.next = newNode;
        return llist;
    }
}
