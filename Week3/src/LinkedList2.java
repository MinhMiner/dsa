// Function Description
// Complete the insertNodeAtTail function in the editor below.
//
// insertNodeAtTail has the following parameters:
//     SinglyLinkedListNode pointer head: a reference to the head of a list
//     int data: the data value for the node to insert
// Returns
//     SinglyLinkedListNode pointer: reference to the head of the modified linked list

public class LinkedList2 {
    // Complete the insertNodeAtTail function below.
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        if (head == null) {
            head = temp;
            return head;
        }
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
        return head; 
    }      
}
