// Function Description
// Complete the getNode function in the editor below.

// getNode has the following parameters:
//     SinglyLinkedListNode pointer head: refers to the head of the list
//     int positionFromTail: the item to retrieve
// Returns
//     int: the value at the desired position

public class LinkedList10 {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        // Write your code here
        llist = reverse(llist);
        SinglyLinkedListNode current = llist;
        while (positionFromTail-- != 0) {
            current = current.next;
        }
        return current.data;
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
                newNode.next = llist;
                return newNode;
        
            }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
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
}
